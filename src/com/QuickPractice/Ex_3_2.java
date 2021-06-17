package com.QuickPractice;
// Принимает значение в см, переводит и выводит в дюймы (и обратно)

import java.util.Scanner;

public class Ex_3_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cm, d;
        System.out.println("Введите значение длины в см: ");
        cm = input.nextDouble();
        d = cm / 2.54;
        System.out.println("Значение длины в дюймах равно: " + d);
        System.out.println("Введите значение длины в дюймах: ");
        d = input.nextDouble();
        cm = d * 2.54;
        System.out.println("Значение длины в см равно: " + cm);
    }
}
