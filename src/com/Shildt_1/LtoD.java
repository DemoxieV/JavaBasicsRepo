package com.Shildt_1;

//Автоматическое (неявное) преобразование (расширение) типа
public class LtoD {
    public static void main(String[] args) {
        long L;
        double D;

        L = 100123285L;
        D = L;

        System.out.println("L and D: " + L + " " + D);
    }
}
