package com.Shildt_3;

// Применение метода substring
public class SubStr {
    public static void main(String[] args) {
        String orgstr = "Java - двигатель прогресса.";

        //Сформировать подстроку
        String substr = orgstr.substring(7, 26);

        System.out.println("Оригинальная строка: " + orgstr);
        System.out.println("Новая строка с подстрокой: " + substr);
    }
}
