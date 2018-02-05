package com.waya.dao;

import com.waya.BaseTest;
import com.waya.entity.Group;
import com.waya.entity.User;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by user on 2018/1/29.
 */
public class GroupDaoTest extends BaseTest {


    @Autowired
    private GroupDao groupDao;

    @Test
    public void testInsertGroup() throws Exception {


         String id ="2";
         String groupName = "第二组";//不可重复，唯一索引
         String parentGroup =""; // 父组
         String hasParent = "0";  //是否有父 组，1，有，0，无，默认0

        int insert = groupDao.insertGroup(id, groupName,parentGroup,hasParent);
        System.out.println("insert=" + insert);
    }


    @Test
    public void testQueryByGroupName() throws Exception {
        String groupName = "第一组";
        List<User> user  = groupDao.queryByGroupName(groupName);
        System.out.println("insert=" + user.toString());
    }

    @Test
    public void testQueryAll() throws Exception {

        List<Group> user  = groupDao.queryAll();
        System.out.println("insert=" + user.toString());
    }

    @Test
    public void testDelelteByGroupName() throws Exception {
        String groupName = "第一组";
        int aa   = groupDao.delUserByGroup(groupName);
        System.out.println("aa=" + aa);
    }


    @Test
    public void testDelelteById() throws Exception {
        String id = "1";
        int aa   = groupDao.delGroupById(id);
        System.out.println("aa=" + aa);
    }

}
