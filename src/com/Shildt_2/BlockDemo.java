package com.Shildt_2;

// Задача: предотвратить деление на ноль
public class BlockDemo {
    public static void main(String[] args) {
        double i, j, d;
        i = 5;
        j = 10;

        if (i != 0) { //тело оператора if - целый блок кода
            System.out.println("i не равно нулю");
            d = j / i;
            System.out.print("j/i равно " + d);
        }
    }
}
