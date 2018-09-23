package com.waya.LeoDemo.algrithmDemo.SortedMethod;

public class Sort {

    public static int[] BubbleSort(int[] ints){
        int n  = ints.length;
        for(int i=0;i<n; i++){
//            此处是n-i-1,
            for(int j=0;j<(n-i-1);j++){
                ints =  Untils.switchArray(j,j+1,ints);
            }
        }
        return ints;
    }

/*
*
* 思想：每步将一个待排序的记录，按其顺序码大小插入到前面已经排序的字序列的合适位置，直到全部插入排序完为止。
•关键问题：在前面已经排好序的序列中找到合适的插入位置。
•方法：
–直接插入排序
–二分插入排序
–希尔排序
https://baike.baidu.com/item/%E6%8E%92%E5%BA%8F#4_4
* */
    public static  int[]  directInsertSort(int[] ints){
        for(int i=1; i<ints.length;i++){
            for(int j=i;j>0;j--){
                if(ints[j]>=ints[j-1]){
                    break;
                }else {
                    int  temp  = ints[j];
                    ints[j]= ints[j-1];
                    ints[j-1] =temp;
                }
                if(ints[j]>= ints[j-1]){
                    break;
                }
                if(ints[j]<ints[j-1]){

                }
            }
        }
        return  ints;
    }

    public static void main(String[] args) {
        int[] a = {3,5,2,0,4};
//        a = Sort.BubbleSort(a);




        a=Sort.directInsertSort(a);

        for(int i=0;i<a.length;i++){
//            if(i==2){break;}
            System.out.println(a[i]);
        }
        System.out.println();
    }

}
