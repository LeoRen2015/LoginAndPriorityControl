package com.waya.LeoDemo.java23desginPattern.lazyInitializate;

public class Program {
    public static void main(String[] args) {
        Fruit.getFruitByTypeNameHighConcurrentVersion(FruitType.banana);
        Fruit.showAll();
        Fruit.getFruitByTypeNameHighConcurrentVersion(FruitType.apple);
        Fruit.showAll();
        Fruit.getFruitByTypeName(FruitType.banana);
        Fruit.showAll();
    }
}
