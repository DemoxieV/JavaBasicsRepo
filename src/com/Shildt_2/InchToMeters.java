package com.Shildt_2;
/*Видоизмените программу, таким образом, чтобы она выводила таблицу перевода дюймов в метры. Выведите значения
  длины до 12 футов через каждый дюйм. После каждых 12 дюймов выведите
  пустую строку (Один метр приблизительно равен 39,37 дюйма.)*/

public class InchToMeters {
    public static void main(String[] args) {
        double inches, meters;
        int counter = 0; //Счетчик строк инициализируется нулевым значением
        for (inches = 1; inches <= 144; inches++) {
            meters = inches * 39.37;
            System.out.println(inches + " дюймов соответствует " + meters + " метрам");
            counter++; //увеличивать значение счетчика на 1 на каждой итерации цикла
            if (counter == 12) { //если значение счетчика равно 12, вывести пустую строку
                System.out.println();
                counter = 0; //сбросить счетчик строк
            }
        }
    }
}
