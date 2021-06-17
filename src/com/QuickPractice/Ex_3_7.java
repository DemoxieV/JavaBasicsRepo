package com.QuickPractice;

import java.util.Scanner;

public class Ex_3_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("Введите целое число: ");
        a = input.nextInt();
        System.out.println("Вы ввели: " + a);
        System.out.println("Три предыдущих числа:");
        System.out.println((a - 1) + "\n" + (a - 2) + "\n" + (a - 3));
    }
}
