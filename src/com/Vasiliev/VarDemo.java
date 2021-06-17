package com.Vasiliev;

import javax.swing.*;

public class VarDemo {
    public static void main(String[] args) {
        int num = 123;
        double x = 32.1;
        char symb = 'A';
        boolean state = true;
        String text = "Используемые переменные:\n";
        text += "Целое число: " + num + "\n";
        text += "Действительное число: " + x + "\n";
        text += "Символ: " + symb + "\n";
        text += "Логическое значение: " + state;
        JOptionPane.showMessageDialog(null, text);
    }
}
