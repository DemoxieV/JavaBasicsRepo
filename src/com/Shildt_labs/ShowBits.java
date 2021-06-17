package com.Shildt_labs;

// Преобразование значения типа byte в двоичный формат. Отображение битов, составляющих байт
// Побитовое И
public class ShowBits {
    public static void main(String[] args) {
        int t;
        byte val;

        val = 123;
        for (t = 128; t > 0; t = t / 2) { // Последовательная проверка переменной val
            if ((val & t) != 0) System.out.print("1 "); // установлен ли бит? да - 1, нет - 0
            else System.out.print("0 ");
        }
    }
}
