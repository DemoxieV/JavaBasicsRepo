package com.Shildt_2;

// Задача: преобразование галлонов в литры. Вывод таблицы перевода значений от 1 до 100 галлонов в литры.
// Подсказка 1 галлон = 3.7854 л

public class GalToLitTable {
    public static void main(String[] args) {
        double gallons, liters;
        int counter = 0; //Счетчик строк инициализируется нулевым значением
        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " галлонам соответствует " + liters + " литров");
            counter++; //увеличивать значение счетчика на 1 на каждой итерации цикла
            if (counter == 10) { //если значение счетчика равно 10, вывести пустую строку
                System.out.println();
                counter = 0; //сбросить счетчик строк
            }
        }
    }
}
