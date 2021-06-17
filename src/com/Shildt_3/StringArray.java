package com.Shildt_3;

// Демонстрация использования массивов строк
public class StringArray {
    public static void main(String[] args) {
        String[] strs = {"Это", "тестовая", "строка."};

        System.out.println("Исходный массив: ");
        for (String s : strs) {
            System.out.print(s + " ");
        }
        System.out.println("\n");

        //Изменение строки
        strs[0] = "Эта строка";
        strs[1] = "также является";
        strs[2] = "тестовой!";

        System.out.println("Измененный массив: ");
        for (String s : strs) {
            System.out.print(s + " ");
        }
    }
}
