package com.waya.service.impl;

import com.waya.common.Utils.IdUtils;
import com.waya.dao.UserDao;
import com.waya.dto.LoginExcution;
import com.waya.entity.User;
import com.waya.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by user on 2018/1/29.
 */
@Service
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserDao userDao;

    public Boolean hasNoPhone(String phone) {
        List<User> users = userDao.queryByPhone(phone);
        if(users != null && users.size()>0){
            return false;
        }else {
            return true;
        }
    }


    @Transactional(propagation = Propagation.REQUIRED)
    public Boolean registerUser(String phone,String userName,String userPassword) {
        if(phone != null && hasNoPhone(phone) && (userPassword !=null) && (!userPassword.equals(""))){
           String id = IdUtils.getRandomUUIDString();
            int addNum = userDao.insertUser(id,phone,userName,IdUtils.getMd5fromString(userPassword));
            if(addNum == 1){
                return true;
            }else{
                return false;
            }
        }
        return false;

    }

    public LoginExcution loginUser(String phone, String userPassword) {
        if(phone != null && !(phone.equals(""))){
           List<User>  users = userDao.queryByPhone(phone);
            if(users != null && users.size()>0){
                if(users.get(0).getUserPassword().equals(IdUtils.getMd5fromString(userPassword))){
                    return new LoginExcution(users.get(0).getId(),1,"登录成功");
                }
            }

        }
            return  new LoginExcution("",0,"登录失败");

    }


    //    以下为封装dao基本操作,
    public int insertUser(User user) {
        return userDao.insertUser(user.getId(),user.getPhone(),user.getUserName(),user.getUserPassword());
    }

    public List<User> queryByPhone(String phone) {
        return userDao.queryByPhone(phone);
    }

    public List<User> queryAll() {
        return userDao.queryAll();
    }

    public int delUserByPhone(String phone) {
        return userDao.delUserByPhone(phone);
    }

    public int delUserById(String id) {
        return userDao.delUserById(id);
    }

}
