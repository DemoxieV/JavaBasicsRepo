package com.Shildt_1;

public class TryVarInit {
    public static void main(String[] args) {
        int count;
        for (count = 0; count < 10; count++) {
            System.out.println("Значение count: " + count);
//            int count; //нельзя объявлять переменную count, так как она была объявлена ранее
//            for (count=0; count<2; count++)
//                System.out.println("В этой программе есть ошибка!");
        }
    }
}
