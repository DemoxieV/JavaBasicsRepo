package com.QuickPractice;

public class Ex_5_4 {
    public static void main(String[] args) {
        int x = -2;
        int y = 5;
        int z = 13;

        System.out.println((z > x) || (x < 0) && (z - y > 9)); // После || не стал проверять -> true
        System.out.println(((z > x) || (x < 0)) && (z - y > 9)); //Следить за скобками - приоритетность операций
    }
}
