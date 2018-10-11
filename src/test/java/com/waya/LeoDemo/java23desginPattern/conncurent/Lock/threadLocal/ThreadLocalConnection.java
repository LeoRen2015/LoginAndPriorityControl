package com.waya.LeoDemo.java23desginPattern.conncurent.Lock.threadLocal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ThreadLocalConnection {

    public static int i = 0;
    public static ThreadLocal<Connection> connectionHolder = new ThreadLocal<Connection>(){
        @Override
        public Connection get() {
            Connection con = null;

            try {
                con= DriverManager.getConnection("DB_URL");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return con;
        }
    };

    public static ThreadLocal<String> stringHolder1 = new ThreadLocal<String>(){
        @Override
        public String  get(){
            i++;
            return "i========================"+i;
        }
    };

    public static String getString1(){
        return  stringHolder1.get();
    }

        public static Connection getConnection(){
            return connectionHolder.get();
        }

}
