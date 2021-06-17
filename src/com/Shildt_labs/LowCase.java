package com.Shildt_labs;

// Преобразование прописных букв английского алфавита в строчные
// Побитовое ИЛИ
public class LowCase {
    public static void main(String[] args) {
        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);

            /*В результате установки в единицу шестого бита
             * значения переменной ch она всегда будет содержать прописную букву*/
            ch = (char) ((int) ch | 32);
            //операнды: код символа и значение 32
            //(двоичное представление - 0000000000100000 - 6ой бит установлен)
            System.out.print(ch + " ");
        }
    }
}
