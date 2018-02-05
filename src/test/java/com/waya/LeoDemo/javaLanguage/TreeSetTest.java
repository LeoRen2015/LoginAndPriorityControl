package com.waya.LeoDemo.javaLanguage;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by user on 2018/1/31.
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        treeSet.add(4);
        treeSet.add(2);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(9);
        treeSet.add(5);
        treeSet.add(10);

        Iterator<Integer>  iterator = treeSet.iterator();

        while(iterator.hasNext()){

            int a = iterator.next();
            System.out.println(a);

        }




    }


}
