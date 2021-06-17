package com.Shildt_2;
// Задача: преобразование галлонов в литры. Подсказка 1 галлон = 3.7854 л

public class GalToLit {

    public static void main(String[] args) {
// переменная1 = объем жидкости в галлонах, исходное значение
        double gallons = 10;
// переменная2 = объем жидкости в литрах
        double liters = gallons * 3.7854;
        System.out.println(gallons + " галлонам соответствует " + liters + " литров");
    }
}
