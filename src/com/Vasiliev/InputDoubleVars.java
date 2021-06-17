package com.Vasiliev;
// Определить индекс массы тела

import javax.swing.*;

public class InputDoubleVars {
    public static void main(String[] args) {
        double mass, height, bmi;
        String result;
        // Считывание значения из поля ввода
        result = JOptionPane.showInputDialog("Ваш рост в метрах: ");
        // Преобразование текста в число через классы-оболочки (обертки)
        height = Double.parseDouble(result);
        result = JOptionPane.showInputDialog("Ваш вес в кг: ");
        mass = Double.parseDouble(result);
        bmi = mass / height / height; // ИМТ
        bmi = Math.round(bmi * 100) / 100.0; //Округление полученного значения
        JOptionPane.showMessageDialog(null, "Индекс массы тела: " + bmi);
    }
}
