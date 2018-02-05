package com.waya.dao;

import com.waya.entity.Role;
import com.waya.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by user on 2018/1/29.
 */
public interface RoleDao {

    /**
     *
     *插入角色
     * @param id
     * @param role

     * @return 插入的行数
     */
    int insertRole(@Param("id") String id, @Param("role") String role);


    /**
     *
     *根据角色名查询是否有改角色
     * @param role
     * @return 角色列表
     */
    List<Role> queryByRole(@Param("role") String role);


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
    int delRoleByRole(@Param("role") String role);

    /**
     *
     *根据id删除该角色
     * @param id
     * @return 删除的行数
     */
    int delRoleById(@Param("id") String id);





}
