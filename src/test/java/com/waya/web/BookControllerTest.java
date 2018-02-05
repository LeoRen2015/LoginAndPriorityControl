package com.waya.web;

import com.alibaba.fastjson.JSONObject;
import com.waya.BaseTest;
import com.waya.service.BookService;
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
 * Created by user on 2018/1/28.
 */
@WebAppConfiguration
@TransactionConfiguration(defaultRollback = true)
@Transactional
public class BookControllerTest extends BaseTest {
    @Autowired
    private WebApplicationContext webApplicationContext;
    private MockMvc mockMvc;
    @Before
    public void setup(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

//get test
    @Test
    public void testGet() throws  Exception{
       ResultActions resultActions =  mockMvc.perform(
                    get("/test/test1").param("id","3").accept(MediaType.APPLICATION_JSON));
        MvcResult mvcResult = resultActions.andReturn();
        String result = mvcResult.getResponse().getContentAsString();
        System.out.println(result);
    }
    //get test
    @Test
    public void testPostNoParam() throws  Exception{
        ResultActions resultActions =  mockMvc.perform(
                post("/test/test2").
                        param("bookId","111",
                                "aaa","222")
                        .contentType(MediaType.APPLICATION_JSON).accept(MediaType.APPLICATION_JSON));
        MvcResult mvcResult = resultActions.andReturn();
        String result = mvcResult.getResponse().getContentAsString();
        System.out.println(result);
    }
//    post test
    @Test
    public void testPost() throws Exception{
        ResultActions resultActions = mockMvc.perform(
                post("/book/appoint")
                .param("bookId","1001",
                        "studentId","12345678910")
  /*              .contentType(MediaType.APPLICATION_JSON)*/
               .accept(MediaType.APPLICATION_JSON));
        MvcResult mvcResult = resultActions.andReturn();
        String result = mvcResult.getResponse().getContentAsString();
        System.out.println(result);
    }
}
