package com.Shildt_labs;

public class ShowBits2 {
    int numbits;

    //Конструктор класса для создания объектов, отображающих заданное число битов
    ShowBits2(int n) {
        numbits = n;
    }

    void show(long val) {
        long mask = 1;
        //Сдвиг значения 1 влево на нужную позицию
        mask <<= numbits - 1;

        int spacer = 0;
        for (; mask != 0; mask >>>= 1) {
            if ((val & mask) != 0) System.out.print("1");
            else System.out.print("0");
            spacer++;
            if ((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}
