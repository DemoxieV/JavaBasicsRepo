package com.Shildt_1;

// Явное приведение (сужение) несовместимых типов
public class CastDemo {
    public static void main(String[] args) {
        double x = 10.0, y = 3.0;
        byte b;
        int i;
        char ch;

        i = (int) (x / y); //Теряется дробная часть числа
        System.out.println("Целочисленный результат деления x/y: " + i);

        i = 100;
        b = (byte) i; //Зд. без потери, byte может содержать значение 100
        System.out.println("Значение b: " + b);

        i = 257;
        b = (byte) i; //С потерей, тип не может содержать значение 257
        System.out.println("Значение b: " + b);

        b = 88; //Представление символа X в коде ASCII
        ch = (char) b; //явное приведение несовместимых типов
        System.out.println("ch: " + ch);
    }
}
