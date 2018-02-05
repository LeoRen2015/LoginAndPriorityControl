package com.waya.LeoDemo.algrithmDemo;

/**
 * Created by user on 2018/1/30.
 */
public class Recurve {
    public static void main(String[] args) {
        int aa = jiecheng2(4);
        System.out.println(jiecheng2(10));
    }
    public static int jiecheng1(int num){
        int result = num;
        int i =num;
        do{
            result = result*i;
                    i--;
        }while(i>1);
        return result;
    }
    public static int a;
    public static int jiecheng2(int num){
        if(num==1){
            return 1;
        }else {
            return a = num*jiecheng2(num-1);
        }
    }
}
