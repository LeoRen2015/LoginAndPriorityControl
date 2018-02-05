package com.waya.service;

import com.waya.dto.AppointExcution;
import com.waya.entity.Book;

import java.util.List;

/**
 * Created by user on 2018/1/27.
 */
public interface BookService {
    /**
     * 查询一本图书
     *
     * @param bookId
     * @return
     */
    Book getById(long bookId);

    /**
     * 查询所有图书
     *
     * @return
     */

    List<Book> getList();

    /**
     * 预约图书
     *
     * @param bookId
     * @param studentId
     * @return
     */
    AppointExcution appoint(long bookId, long studentId);
}
