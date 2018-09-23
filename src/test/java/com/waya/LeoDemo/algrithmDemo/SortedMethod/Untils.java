package com.waya.LeoDemo.algrithmDemo.SortedMethod;

public class Untils {
    /*
    *
    * 如果a >b  返回true，a<=b，返回false.
    * */

    public static boolean compareInt(int a,int b){
        if(a>b){
            return true;
        }else {
            return false;
        }
    }
        /*
        * 如果 数组里的i号元素，大于j号元素，那么久对调，返回数组
        *
        * */
    public static int[] switchArray(int i, int j,int[] ints){
        if(compareInt(ints[i],ints[j])){
            int temp = ints[i];
            ints[i] = ints[j];
            ints[j] = temp;
        }
        return  ints;
    }
/*
*
*
* k 前面是排序好的array,从小到大排列,后面是没有排序的
* */

    public static  int[] insertSortedArrayAndMoveElements(int[] ints,int k){
//k元素已经大于等于k-1元素，直接返回
        if(ints[k] >=ints[k-1]){
            return ints;
        }
        for(int i=k-1;i>0;i--){
            if(ints[k] <ints[i] &&  ints[k] >=ints[i-1]){
//                插入
                int temp = ints[k];
//                从 i+1元素后移到k
                for(int  j=k;j>i;k--){
                    temp = ints[k];
                    ints[j]=ints[j-1];
                }
                ints[i]=temp;
            }
        }
        return  ints;
    }

    public static void main(String[] args) {
        System.out.println(compareInt(3,3));
        int[] ints = new int[4];
        ints[0] =4;
        try {
            ints[4]=2;
        } catch (Exception e) {
            e.printStackTrace();
        }
        ints[1]=2;
        ints[2]=5;
        ints[3]=3;
        ints = switchArray(0,1,ints);
    }
}
