package com.waya.LeoDemo.javaLanguage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by user on 2018/1/31.
 */
public class ComparatorExample {

    /**
     *
     * comparator 排序测试
    *
    * */
    class Dog{
        private  int age;
        private String name;

        public Dog(int age, String name) {
            super();
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }
        public String getName() {
            return name;
        }
    }
    public static void main(String[] args) {
        List<Dog> list = new ArrayList<Dog>();
        list.add(new ComparatorExample().new Dog(5,"55"));
        list.add(new ComparatorExample().new Dog(2,"22"));
        list.add(new ComparatorExample().new Dog(3,"33"));
        list.add(new ComparatorExample().new Dog(4,"44"));

        Collections.sort(list, new Comparator<Dog>() {
            public int compare(Dog o1, Dog o2) {
                return o1.getAge()- o2.getAge();
            }
        });

        for(int i = 0;i <list.size();i++){
            System.out.println(list.get(i).getName());
        }
    }
}
