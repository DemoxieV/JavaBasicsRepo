package com.Shildt_2;

public class IfDemo {
    public static void main(String[] args) {
        int a, b, c;
        a = 2;
        b = 3;
        if (a == b) System.out.println("Эта строка не будет выведена");
        if (a < b) System.out.println("a меньше b");
        System.out.println();
        c = a - b; //переменная c = -1
        System.out.println("c=-1");
        if (c >= 0) System.out.println("c - положительное число");
        if (c < 0) System.out.println("c - отрицательное число");
        System.out.println();
        c = b - a;
        System.out.println("Теперь c=1");
        if (c >= 0) System.out.println("c - положительное число");
        if (c < 0) System.out.println("c - отрицательное число");
    }
}
