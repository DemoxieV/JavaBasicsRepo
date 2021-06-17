package com.Shildt_1;

// Демонстрация области действия (видимости) блока кода
public class ScopeDemo {
    public static void main(String[] args) {
        int x; //переменная доступна для всего кода в методе main
        x = 10;
        if (x == 10) { //начало новой области действия
            int y = 20; //переменная доступна только в данном блоке if, здесь доступны x и y
            System.out.println("x и y: " + x + " " + y);
            x = y * 2;
        }
        // y=100; Ошибка - в этом месте y не доступна
        // x по-прежнему доступна
        System.out.println("x = " + x);
    }
}
