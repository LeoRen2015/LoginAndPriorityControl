package com.waya.LeoDemo.javaLanguage.RecuisionJava;

public class Recurse {

    public static int factorialInt(int n){

        if(n==1){
            return n;
        }else{
            System.out.println("n="+n);
            return n*factorialInt(n-1);
        }
    }
// https://blog.csdn.net/bruce_suxin/article/details/52937720
    public static int fobbinic(int n){
        if(n==1 || n ==2){
            return 1;
        }
        System.out.println("n="+ n);
        return fobbinic(n-1)+fobbinic(n-2);
    }

    public static int fff(int n){
        if(n==1 || n ==2){
            return 1;
        }
        return  fff(n-1)+fff(n-2);
    }


}
