package com.waya.LeoDemo.javaLanguage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by user on 2018/1/31.
 */
public class HashMapTest {



    public static void main(String[] args) {
        Map<String,String>  leoMap = new HashMap<String, String>();
        leoMap.put("1","111");
        leoMap.put("2","222");
        leoMap.put("3","333");
        leoMap.put("4","444");

         Iterator<Map.Entry<String,String>> aa = leoMap.entrySet().iterator();

        while(aa.hasNext()){
            Map.Entry<String,String> a = aa.next();
            String key = a.getKey();
            String value = a.getValue();
        }
    }
}
