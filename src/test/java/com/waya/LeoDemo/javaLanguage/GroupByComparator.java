package com.waya.LeoDemo.javaLanguage;

/**
 * Created by user on 2018/1/31.
 */
public class GroupByComparator {
    /**
     * comparator 分组测试
     * */

    class Apple{
        private String color;
        private  int weight;

        public Apple(int weight, String color) {
            super();
            this.weight = weight;
            this.color = color;
        }
        public String getColor() {
            return color;
        }
        public int getWeight() {
            return weight;
        }

        @Override
        public String toString() {
            return "Apple{" +
                    "color='" + color + '\'' +
                    ", weight=" + weight +
                    '}';
        }
    }






}
