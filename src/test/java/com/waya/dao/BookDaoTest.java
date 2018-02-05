package com.waya.dao;

import com.waya.BaseTest;
import com.waya.entity.Book;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by user on 2018/1/26.
 */
public class BookDaoTest extends BaseTest{

    @Autowired
    private BookDao bookDao;


    @Test
    public  void testQueryById() {
        long  bookId= 1000;
        Book book  = bookDao.queryById(bookId);
        System.out.println(book);
    }

}
