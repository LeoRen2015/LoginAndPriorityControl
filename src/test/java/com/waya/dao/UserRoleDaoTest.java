package com.waya.dao;

import com.waya.BaseTest;
import com.waya.common.Utils.IdUtils;
import com.waya.entity.User;
import com.waya.entity.UserRole;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by user on 2018/1/29.
 */
//@Transactional
public class UserRoleDaoTest extends BaseTest {


    @Autowired
    private UserRoleDao userRoleDao;

    @Test
    public void testInsertUserRole() throws Exception {
        String id = IdUtils.getRandomUUIDString();
        String userId = "09c316daa33a4c198b1646f566abb21c";
        String roleId = "2";
        int insert = userRoleDao.insertUserRole(id, userId,roleId);
        System.out.println("insert=" + insert);
    }

    @Test
    public void testQueryByUserId() throws Exception {
        String userId = "2159f9aec52246c7958b0fe25519f677";
        List<UserRole> userRoles = userRoleDao.queryByUserId(userId);
        System.out.println("insert=" + userRoles.toString());
    }
    @Test
    public void testQueryByRoleId() throws Exception {
        String roleId = "2";
        List<UserRole> userRoles = userRoleDao.queryByRoleId(roleId);
        System.out.println("insert=" + userRoles.toString());
    }

    @Test
    public void testQueryAll() throws Exception {

        List<UserRole> userRoles  = userRoleDao.queryAll();
        System.out.println("insert=" + userRoles.toString());
    }

    @Test
    public void testDelelteByUserId() throws Exception {
        String userId = "09c316daa33a4c198b1646f566abb21c";
        int delNum   = userRoleDao.delUserRoleByUserId(userId);
        System.out.println("aa=" + delNum);
    }
  @Test
    public void testDelelteByRoleId() throws Exception {
        String roleId = "2";
        int delNum   = userRoleDao.delUserRoleByRoleId(roleId);
        System.out.println("aa=" + delNum);
    }

    @Test
    public void testDelelteById() throws Exception {
        String id = "cbeb9935472844608c0c84e2d2d642f9";
        int delNum   = userRoleDao.delUserRoleById(id);
        System.out.println("aa=" + delNum);
    }
}
