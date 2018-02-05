package com.waya.web;

import com.alibaba.fastjson.JSON;
import com.waya.BaseTest;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashMap;
import java.util.Map;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

/**
 * Created by user on 2018/1/29.
 */
@WebAppConfiguration
@TransactionConfiguration(defaultRollback = true)
//@Transactional
public class UserControllerTest extends BaseTest{

    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;
    @Before
    public void setup(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    //get test
    @Test
    public void testHasNoPhone() throws  Exception{
        ResultActions resultActions =  mockMvc.perform(
                get("/user/hasNoPhone").param("phone","2").accept(MediaType.APPLICATION_JSON));
        MvcResult mvcResult = resultActions.andReturn();
        String result = mvcResult.getResponse().getContentAsString();
        System.out.println(result);
    }

    @Test
    public void testRegisterUser() throws  Exception{
        Map<String,String> param = new HashMap<String,String>();
        param.put("phone","11133333333");
        param.put("userName","lallal");
        param.put("userPassword","222");
        String paramJson = JSON.toJSON(param).toString();
        ResultActions resultActions =  mockMvc.perform(
                post("/user/registerUser").
                        param("paramJson",paramJson)
                        .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON));
        MvcResult mvcResult = resultActions.andReturn();
        String result = mvcResult.getResponse().getContentAsString();
        System.out.println(result);
    }

    @Test
    public void testLoginUser() throws  Exception{
        Map<String,String> param = new HashMap<String,String>();
        param.put("phone","11133333333");
        param.put("userPassword","222");
        String paramJson = JSON.toJSON(param).toString();
        ResultActions resultActions =  mockMvc.perform(
                post("/user/loginUser").
                        param("paramJson",paramJson)
                        .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON));
        MvcResult mvcResult = resultActions.andReturn();
        String result = mvcResult.getResponse().getContentAsString();
        System.out.println(result);
    }
}
