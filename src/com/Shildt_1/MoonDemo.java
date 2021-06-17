package com.Shildt_1;

// Сила тяжести на Луне составляет около 17% земной. Напишите программу, которая вычислила бы ваш вес на Луне.
public class MoonDemo {
    public static void main(String[] args) {
        double earth_weight = 71, moon_weight;
        moon_weight = earth_weight * 0.17;
        System.out.println(earth_weight + " килограммов на Земле соответствует " + moon_weight + " килограммов на Луне");
    }
}
