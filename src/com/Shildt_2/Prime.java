package com.Shildt_2;

// Нахождение простых чисел, имеющих только два делителя - 1 и оно само, в диапазоне от 2 до 100
public class Prime {
    public static void main(String[] args) {
        int i, j;
        boolean res;

        for (i = 2; i < 100; i++) {
            res = true;
            //проверка, что делится число без остатка
            for (j = 2; j <= i / j; j++)
                if ((i % j) == 0) res = false;

            if (res)
                System.out.println(i + " - простое число");
        }
    }
}
