package com.Shildt_1;

public class BoolDemo {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("Значение b: " + b);
        b = true;
        System.out.println("Значение b: " + b);
//  Использование логических значений в условной конструкции if
        if (b) System.out.println("Эта инструкция выполняется");
        b = false;
        if (b) System.out.println("Эта инструкция не выполняется");
//  В результате сравнения получается логическое значение
//  Скобки здесь необходимы в выражении (10>9), т.к. оператор + имеет более высокий приоритет по сравнению с >
        System.out.println("Результат сравнения 10>9: " + (10 > 9));
    }
}
