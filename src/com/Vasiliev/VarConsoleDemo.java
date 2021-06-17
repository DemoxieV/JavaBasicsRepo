package com.Vasiliev;

public class VarConsoleDemo {
    public static void main(String[] args) {
        int num = 123;
        double x = 32.1;
        char symb = 'A';
        boolean state = true;
        String text = "Используемые переменные:\n";
        text += "Целое число: " + num + "\n";
        text += "Действительное число: " + x + "\n";
        text += "Символ: " + symb + "\n";
        text += "Логическое значение: " + state;
        System.out.println(text);
    }
}
