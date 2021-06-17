package com.QuickPractice;
//конвертер валют

import java.util.Scanner;

public class Ex_3_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double money, rate;
        System.out.println("Введите сумму для конвертации (в валюте): ");
        money = input.nextDouble();
        System.out.println("Введите курс: ");
        rate = input.nextDouble();
        double result = money * rate;
        System.out.println("Сумма в рублях равна " + result);
    }
}
