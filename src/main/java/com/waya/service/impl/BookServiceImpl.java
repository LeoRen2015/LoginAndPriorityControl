package com.waya.service.impl;

import com.waya.dao.AppointmentDao;
import com.waya.dao.BookDao;
import com.waya.dto.AppointExcution;
import com.waya.entity.Appointment;
import com.waya.entity.Book;
import com.waya.enums.AppointStateEnum;
import com.waya.exception.AppointException;
import com.waya.exception.NoNumberException;
import com.waya.exception.RepeatAppointException;
import com.waya.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by user on 2018/1/27.
 */
@Service
public class BookServiceImpl implements BookService{
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BookDao bookDao;

    @Autowired
    private AppointmentDao appointmentDao;



    public Book getById(long bookId) {
        return bookDao.queryById(bookId);
    }

    public List<Book> getList() {
        return bookDao.queryAll(0,1000);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    /**
     * 使用注解控制事务方法的优点： 1.开发团队达成一致约定，明确标注事务方法的编程风格
     * 2.保证事务方法的执行时间尽可能短，不要穿插其他网络操作，RPC/HTTP请求或者剥离到事务方法外部
     * 3.不是所有的方法都需要事务，如只有一条修改操作，只读操作不需要事务控制
     */
    public AppointExcution appoint(long bookId, long studentId) {
        try{
//            减库存
           int  updateNum = bookDao.reduceNumber(bookId);
           if(updateNum<=0){//库存不足
               throw new NoNumberException("no number");
           }else{
               int insert = appointmentDao.insertAppointment(bookId,studentId);
              if(insert<= 0){//重复预约
                  throw new RepeatAppointException("repeat apointment");
              }else {
                  Appointment appointment = appointmentDao.queryByKeyWithBook(bookId,studentId);
                  return new AppointExcution(bookId, AppointStateEnum.SUCCESS,appointment);
              }//为了便于控制层识别哪个异常，要按照异常的捕获顺序进行捕获，先捕获子类，如果没有匹配对应的子类，则统一转换成预约异常
           }}catch (NoNumberException e1){
            throw e1;
        }catch (RepeatAppointException e2){
            throw e2;
        }catch(Exception e){
            // 所有编译期异常转换为运行期异常
            //return new AppointExecution(bookId, AppointStateEnum.INNER_ERROR);//错误写法
            logger.error(e.getMessage(),e);
            throw new AppointException("appoint inner error:"+ e.getMessage());
        }
    }
}
