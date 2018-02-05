package com.waya.service.impl;

import com.waya.entity.UserRole;
import com.waya.service.UserRoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by user on 2018/1/30.
 */
@Service
public class UserRoleServiceImpl implements UserRoleService {

    Logger logger = LoggerFactory.getLogger(this.getClass());

//+++++++++++++++++++++++++以下为业务逻辑方法++++++++++++++++++++++++++++++








//+++++++++++++++++++++++++以下为封装dao层的基本方法++++++++++++++++++++++++++++++
    public int insertUserRole(String id, String userId, String roleId) {
        return 0;
    }

    public List<UserRole> queryByUserId(String userId) {
        return null;
    }

    public List<UserRole> queryByRoleId(String roleId) {
        return null;
    }

    public List<UserRole> queryAll() {
        return null;
    }

    public int delUserRoleByUserId(String userId) {
        return 0;
    }

    public int delUserRoleByRoleId(String roleId) {
        return 0;
    }

    public int delUserRoleById(String id) {
        return 0;
    }
}
