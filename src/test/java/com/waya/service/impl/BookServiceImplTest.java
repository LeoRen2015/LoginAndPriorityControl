package com.waya.service.impl;

import com.waya.BaseTest;
import com.waya.dto.AppointExcution;
import com.waya.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by user on 2018/1/28.
 */
public class BookServiceImplTest extends BaseTest {


    @Autowired
    private BookService bookService;

    @Test
    public  void testAppoint() throws  Exception{
        long bookId = 1001;
        long studentId = 12345678910L;
        AppointExcution appointExcution = bookService.appoint(bookId,studentId);
        System.out.println(appointExcution);
    }


}
