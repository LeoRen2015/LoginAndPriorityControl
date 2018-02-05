package com.waya.dao;

import com.waya.BaseTest;
import com.waya.common.Utils.IdUtils;
import com.waya.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

/**
 * Created by user on 2018/1/29.
 */
//@Transactional
public class UserDaoTest extends BaseTest {


    @Autowired
    private UserDao userDao;

    @Test
    public void testInsertUser() throws Exception {
        String id = IdUtils.getRandomUUIDString();
//        String id =  "500c534b5c224e46bb685bec933a4d4c"; // 测试主键冲突 配合mapper中的ignore 测试，是否有异常
        String phone = "22234484343";
        String userName = "ss";
        String userPassWord = IdUtils.getMd5fromString("dfs");
        int insert = userDao.insertUser(id, phone,userName,userPassWord);
        System.out.println("insert=" + insert);
    }



    @Test
    public void testQueryByPhone() throws Exception {
        String phone = "2147483647";
        List<User> user  = userDao.queryByPhone(phone);
        System.out.println("insert=" + user.toString());
    }

    @Test
    public void testQueryAll() throws Exception {

        List<User> user  = userDao.queryAll();
        System.out.println("insert=" + user.toString());
    }

    @Test
    public void testDelelteByPhone() throws Exception {
        String phone = "11234567543";
        int aa   = userDao.delUserByPhone(phone);
        System.out.println("aa=" + aa);
    }


    @Test
    public void testDelelteById() throws Exception {
        String id = "1";
        int aa   = userDao.delUserById(id);
        System.out.println("aa=" + aa);
    }

}
