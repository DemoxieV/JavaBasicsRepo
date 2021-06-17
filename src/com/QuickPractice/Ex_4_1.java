package com.QuickPractice;

import java.util.Scanner;

public class Ex_4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, z;
        System.out.println("Введите целое двузначное число: ");
        x = input.nextInt();
        y = x / 10;
        z = x - y * 10;
        System.out.println(y + " " + z);
    }
}
