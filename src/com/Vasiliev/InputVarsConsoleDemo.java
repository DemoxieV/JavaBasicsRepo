package com.Vasiliev;

import java.util.Scanner;

public class InputVarsConsoleDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int now = 2019;
        String name;
        int age;
        double height;
        double mass;

        System.out.println("Ваше имя: ");
        name = input.nextLine(); // Считывание значения
        System.out.println("Ваш возраст: ");
        age = input.nextInt();
        System.out.println("Ваш рост в метрах: ");
        height = input.nextDouble();
        System.out.println("Ваш вес в килограммах: ");
        mass = input.nextDouble();
        double bmi = mass / height / height;

        System.out.println("Здравствуйте, " + name + "!");
        System.out.println("Вы родились в " + (now - age) + " году.");
        // %5.2f - инструкция форматирования в методе printf():
        // % - идентификатор инструкции форматирования
        // f - число в формате с плавающей точкой
        // 5.2 - для отображения числа исп-ся не менее пяти позиций до запятой и две цифры после запятой
        System.out.printf("Ваш индекс массы тела: %5.2f\n", bmi);
    }
}
