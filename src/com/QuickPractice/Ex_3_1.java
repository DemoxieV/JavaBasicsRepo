package com.QuickPractice;
//Принимает значение температуры по шкале Фаренгейта, а выводит по шкале Цельсия

import java.util.Scanner;

public class Ex_3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double F;
        double C;
        System.out.println("Введите температуру по шкале Фаренгейта: ");
        F = input.nextDouble();
        C = 5 * (F - 32) / 9;
        System.out.println("Температура по шкале Цельсия: " + C);
    }
}
