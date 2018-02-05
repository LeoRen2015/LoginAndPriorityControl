package com.waya.web;

import com.waya.dto.Result;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by user on 2018/1/28.
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/test1")
    @ResponseBody
    private Result<String> test1(String id){
        System.out.println(id);
        List<String> aa = new LinkedList();
        aa.add("aa");
        aa.add("bb");
        aa.add("cc");
        return new Result(true,aa);
    }


    @RequestMapping(value = "/test2",method = RequestMethod.POST,produces = "application/json; charset=utf-8")
    @ResponseBody
    private Result<String> test2(@RequestParam String bookId,Long aaa){
        String id2 = bookId;
        Long aaaa = aaa;
        List<String> aa = new LinkedList();
        aa.add("aa");
        aa.add("bb");
        aa.add("cc");
        return new Result(true,aa);
    }
}
