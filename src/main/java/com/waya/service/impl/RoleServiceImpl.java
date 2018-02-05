package com.waya.service.impl;

import com.waya.dao.RoleDao;
import com.waya.dao.UserDao;
import com.waya.dto.RoleExcution;
import com.waya.entity.Role;
import com.waya.service.RoleService;
import com.waya.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by user on 2018/1/29.
 */
@Service
public class RoleServiceImpl implements RoleService {
    Logger logger  = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private UserService userService;


    public RoleExcution addRoleToUser(String role,String user) {
        List<Role> roles = queryByRole(role);
        if(roles != null && roles.size()>0){
        }
        return null;
    }






    //+++++++++++++++++++++++++以下为封装dao层的基本方法++++++++++++++++++++++++++++++
    public int insertRole(Role role) {
        return roleDao.insertRole(role.getId(),role.getRole());
    }

    public List<Role> queryByRole(String role) {
        return roleDao.queryByRole(role);
    }

    public List<Role> queryAll() {
        return roleDao.queryAll();
    }

    public int delRoleByRole(String role) {
        return roleDao.delRoleByRole(role);
    }

    public int delRoleById(String id) {
        return roleDao.delRoleById(id);
    }
}
