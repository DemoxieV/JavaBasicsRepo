package com.Shildt_1;

//Определение длины гипотенузы исходя из длины катетов, по теореме Пифагора
public class Hypot {
    public static void main(String[] args) {
        double x = 3, y = 4, z;
        z = Math.sqrt(x * x + y * y);
        System.out.println("Длина гипотенузы: " + z);
    }
}
