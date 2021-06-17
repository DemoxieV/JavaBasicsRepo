package com.Vasiliev;
//Определить год рождения

import javax.swing.*;

public class InputIntVars {
    public static void main(String[] args) {
        int age, birth, year;
        String result;
        result = JOptionPane.showInputDialog("Какой сейчас год?");
        year = Integer.parseInt(result);
        result = JOptionPane.showInputDialog("Сколько вам лет?");
        age = Integer.parseInt(result);
        birth = year - age;
        JOptionPane.showMessageDialog(null, "Вы родились в " + birth + " году!");
    }
}
