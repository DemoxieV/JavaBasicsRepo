package com.Shildt_1;

public class DynInit {
    public static void main(String[] args) {
//  Константы:
        double radius = 4, height = 5;
//  Переменная volume динамически инициализируется во время выполнения:
        double volume = 3.1416 * radius * radius * height;
        System.out.println("Объем цилиндра: " + volume);
    }
}
