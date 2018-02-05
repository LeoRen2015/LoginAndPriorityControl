package com.waya.web;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.waya.dto.AppointExcution;
import com.waya.dto.Result;
import com.waya.entity.Book;
import com.waya.enums.AppointStateEnum;
import com.waya.exception.AppointException;
import com.waya.exception.NoNumberException;
import com.waya.exception.RepeatAppointException;
import com.waya.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by user on 2018/1/28.
 */
@Controller
@RequestMapping("/book")
public class BookController {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private BookService bookService;

   @RequestMapping(value = "/list",method = RequestMethod.GET)
    private String list(Model model){
        List<Book> list = bookService.getList();
        model.addAttribute("list",list);
        return "list";
    }

    @RequestMapping(value = "/{bookId}/detail", method = RequestMethod.GET)
    private String detail(@PathVariable("bookId") Long bookId, Model model){
        if(bookId == null){
            return "redirect:/book/list";
        }
        Book book =  bookService.getById(bookId);
        if(book == null){
            return "forward:/book/list";
        }
        model.addAttribute(book);
        return "detail";
    }

//    ajax json 数据
    @RequestMapping(value = "/appoint",method = RequestMethod.POST,produces = "application/json"/*,consumes = "application/json"*/)
    @ResponseBody
    private Result<AppointExcution> appoint( String bookId,  String studentId ){
        if(studentId == null || studentId.equals("")){
            return  new Result(false,"学号不能为空");
        }
        AppointExcution appointExcution = null;
//        try{
//            appointExcution = bookService.appoint(bookId,studentId);
//        }catch (NoNumberException e1){
//            appointExcution = new AppointExcution(bookId, AppointStateEnum.NO_NUMBER);
//        }catch (RepeatAppointException e2){
//            appointExcution = new AppointExcution(bookId,AppointStateEnum.REPEAT_APPOINT);
//        }catch(Exception e){
//            appointExcution = new AppointExcution(bookId, AppointStateEnum.INNER_ERROR);
//        }
        return  new Result<AppointExcution>(true,appointExcution);

    }
}
