package com.waya.dao;

import com.waya.BaseTest;
import com.waya.entity.Prev;
import com.waya.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

/**
 * Created by user on 2018/1/29.
 */
public class PrevDaoTest extends BaseTest {


    @Autowired
    private PrevDao prevDao;

    @Test
    public void testInsertPrev() throws Exception {
        String id = "1";
        String prev = "11234567543";
        String resourceType = "element";
        int insert = prevDao.insertPrev(id, prev,resourceType);
        System.out.println("insert=" + insert);
    }


    @Test
    public void testQueryByPhone() throws Exception {
        String prev = "11234567543";
        List<Prev> user  = prevDao.queryByPrev(prev);
        System.out.println("insert=" + user.toString());
    }

    @Test
    public void testQueryAll() throws Exception {

        List<Prev> user  = prevDao.queryAll();
        System.out.println("insert=" + user.toString());
    }

    @Test
    public void testDelelteByPhone() throws Exception {
        String prev = "11234567543";
        int aa   = prevDao.delPrevByPrev(prev);
        System.out.println("aa=" + aa);
    }


    @Test
    public void testDelelteById() throws Exception {
        String id = "1";
        int aa   = prevDao.delPrevById(id);
        System.out.println("aa=" + aa);
    }

}
