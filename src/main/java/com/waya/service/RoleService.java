package com.waya.service;

import com.waya.dto.RoleExcution;
import com.waya.entity.Role;

import java.util.List;

/**
 * Created by user on 2018/1/29.
 */
public interface RoleService {

    /**
     *
    * 给用户绑定角色：
    *@return  返回操作信息
     *
    **/

    public RoleExcution addRoleToUser(String role,String user);

//以下为封装roleDao的基本操作

    /**
     *
     *插入角色
     * @return 插入的行数
     */
    int insertRole(Role role);


    /**
     *
     *根据角色名查询是否有改角色
     * @param role
     * @return 角色列表
     */
    List<Role> queryByRole(String role);


    /**
     *
     *查询所有角色
     */
    List<Role> queryAll();


    /**
     *
     *根据角色名删除角色
     * @param role
     * @return 删除的行数
     */
    int delRoleByRole( String role);

    /**
     *
     *根据id删除该角色
     * @param id
     * @return 删除的行数
     */
    int delRoleById( String id);



}
