package com.Shildt_2;

//Неожиданный результат повышения типов в выражениях
public class PromDemo {
    public static void main(String[] args) {
        byte b = 10;
        int i = b * b; //приведение типов не требуется, тип повышен до int
        b = (byte) (b * b); //значение (b*b) повышается до типа int - требуется приведение типов
        System.out.println("i и b: " + i + " " + b);
        System.out.println();

        int j;
        for (j = 0; j < 5; j++) {
            System.out.println(j + " / 3: " + j / 3);
            System.out.println(j + " / 3 c дробной частью: " + (double) j / 3);
            System.out.println();
        }
    }
}
