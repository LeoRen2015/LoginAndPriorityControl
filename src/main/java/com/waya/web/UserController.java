package com.waya.web;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.waya.dto.LoginExcution;
import com.waya.dto.Result;
import com.waya.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by user on 2018/1/29.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @RequestMapping(value = "/hasNoPhone",method = RequestMethod.GET)
    @ResponseBody
    private Result<Boolean> hasNoPhone(String phone){
        if(userService.hasNoPhone(phone)){
            return  new Result(true,"没有号码，未注册");
        }else {
            return  new Result(true,"有号码，已注册");
        }
    }


    @RequestMapping(value = "/registerUser",method = RequestMethod.POST,produces = "application/json")
    @ResponseBody
//    private Result<Boolean> registerUser(@RequestParam String phone, String userName, String userPassword ) {
    private Result<Boolean> registerUser(@RequestParam String paramJson ) {
        System.out.println("进来了+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        JSONObject param = JSON.parseObject(paramJson);

        String phone= param.get("phone").toString();
        String userName = param.get("userName").toString();
        String userPassword = param.get("userPassword").toString();
       if( userService.registerUser(phone,userName,userPassword)){
           return  new Result(true,"注册成功");
       }else {
           return  new Result(false,"注册失败");
       }
    }
    @RequestMapping(value = "/loginUser",method = RequestMethod.POST,produces = "application/json")
    @ResponseBody
//    private Result<Boolean> loginUser(@RequestParam String phone,String userPassword ) {
    private Result<Boolean> loginUser(@RequestParam String paramJson ) {
        System.out.println("进来了+++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        JSONObject param = JSON.parseObject(paramJson);
        String phone = param.get("phone").toString();
        String userPassword = param.get("userPassword").toString();
        LoginExcution loginExcution = userService.loginUser(phone,userPassword);
        if( loginExcution.getState() == 1){
            return  new Result(true,"登录成功");
        }else {
            return  new Result(false,"登陆失败");
        }
    }

}
