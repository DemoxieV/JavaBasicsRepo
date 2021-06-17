package com.Shildt_2;

// Демонстрация времени жизни переменной
public class VarInitDemo {
    public static void main(String[] args) {
        int x;
        for (x = 0; x < 3; x++) {
            int y = -1; //переменная инициализируется при каждом входе в цикл (блок)
            System.out.println("y: " + y); // всегда вывод значения -1
            y = 100;
            System.out.println("Измененное значение y: " + y);
        } // по завершении цикла значение y теряется, при каждом входе в цикл инициализируем заново
    }
}
