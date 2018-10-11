package com.waya.LeoDemo.javaLanguage.JavaCollectionTest.MapTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class JavaListTest {

    public static void main(String[] args) {
/*        List<String> list = new ArrayList<String>();
        for(int i=0;i<10;i++){
            list.add("string"+i);
        }

        Iterator<String> iterator = list.iterator();
        list.add("asdfa");

        while(iterator.hasNext()){
            if(iterator.next().equals("string3")){
                iterator.remove();
            }
        }

        iterator = list.iterator();
        while(iterator.hasNext()){
            if(iterator.next().equals("string5")){
                iterator.remove();
            }
        }

        iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        */

/*++++++++++++++++++++++++++++++++++++++测试2++++++++++++++++++++++++++++++*/
/*
        int[] ints = {  2,5,3};
        System.out.println("排序前的数组");
        for(int i:ints){
            System.out.println(i+"");
        }

        Arrays.sort(ints);
        System.out.println("排序后的数组");

        for(int i:ints) {
            System.out.println(i + "");
        }*/

/* +++++++++++++++ 二维数组++++++++++++++++++++++++++*/
       /* int[][] intDim = {{1,2},{3,4},{4,56,7,8,9},{233,34,5,6,7,7,8}};
        System.out.println("+++++++++++++foreach 输出数组");
        for(int[] x:intDim){
            System.out.println("+++++++=");
            for(int i:x){
                System.out.println("i++++++"+i);
            }
        }
*/

        int[][][]  intThree = {{{1,2},{3,4}},
                {{5,6},{7,8},{9,10}},
                {{11,12},{15,16},{17,18}}};
        for(int[][] intTwo: intThree){
            for(int[] intOne:intTwo){
                for(int x:intOne){
                    System.out.println("x++++++++++++++"+x);
                }
            }
        }
    }
}