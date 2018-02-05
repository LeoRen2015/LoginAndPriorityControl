package com.waya.dao;

import com.waya.BaseTest;
import com.waya.entity.Role;
import com.waya.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by user on 2018/1/29.
 */
public class RoleDaoTest extends BaseTest {


    @Autowired
    private RoleDao roleDao;

    @Test
    public void testinsertRole() throws Exception {
        String id = "4";
        String role = "normalUser";
        int insert = roleDao.insertRole(id, role);
        System.out.println("insert=" + insert);
    }


    @Test
    public void testQueryByRole() throws Exception {
        String role = "admin";
        List<Role> roles  = roleDao.queryByRole(role);
        System.out.println("insert=" + roles.toString());
    }

    @Test
    public void testQueryAll() throws Exception {

        List<Role> user  = roleDao.queryAll();
        System.out.println("insert=" + user.toString());
    }

    @Test
    public void testDelelteByRole() throws Exception {
        String role = "normalUser";
        int aa   = roleDao.delRoleByRole(role);
        System.out.println("aa=" + aa);
    }


    @Test
    public void testDelelteById() throws Exception {
        String id = "4";
        int aa   = roleDao.delRoleById(id);
        System.out.println("aa=" + aa);
    }

}
