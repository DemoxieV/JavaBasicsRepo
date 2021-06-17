package com.Shildt_2;

public class SideEffects {
    public static void main(String[] args) {
        int i = 0;
        // Значение переменной инкрементируется,
        // несмотря на то, что проверяемое условие в инструкции if ложно
        if (false & (++i < 100))
            System.out.println("Эта строка не будет отображаться");
        System.out.println("Инструкция if выполняется: " + i); //отображается 1

        //Здесь значение не инкрементируется, т.к. 2ой операнд на вычисляется
        if (false && (++i < 100))
            System.out.println("Эта строка не будет отображаться");
        System.out.println("Инструкция if выполняется: " + i); //по-прежнему отображается 1
    }
}
