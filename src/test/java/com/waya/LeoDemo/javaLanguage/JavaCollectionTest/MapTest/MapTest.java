package com.waya.LeoDemo.javaLanguage.JavaCollectionTest.MapTest;

import org.apache.commons.collections.map.HashedMap;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashedMap();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        map.put("e",5);
        Set<Map.Entry<String,Integer>> setKey = map.entrySet();
        Iterator<Map.Entry<String,Integer>> entryMap = map.entrySet().iterator();
        while( entryMap.hasNext()){
            if(entryMap.next().getKey().equals("b")){
                entryMap.remove();
            }
        }

        entryMap = map.entrySet().iterator();
        while(entryMap.hasNext()){
            System.out.println("key+"+entryMap.next().getKey());
        }

        if(map.containsKey("b")){
            System.out.println(map.get("b"));
        }else{
            System.out.println("无b");
        }



    }
}
