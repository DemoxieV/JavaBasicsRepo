package com.Shildt_2;

public class RelLogOps {
    public static void main(String[] args) {
        int i, j;
        boolean b1, b2;
        i = 10;
        j = 11;

        //Операторы сравнения:
        if (i < j) System.out.println("i < j");
        if (i <= j) System.out.println("i <= j");
        if (i != j) System.out.println("i != j");
        if (i == j) System.out.println("Не будет выполнено");
        if (i >= j) System.out.println("Не будет выполнено");
        if (i > j) System.out.println("Не будет выполнено");

        //Логические операторы:
        b1 = true;
        b2 = false;
        //логическое И: если оба операнда true
        if (b1 & b2) System.out.println("Не будет выполнено");
        //логическое И и НЕ - если НЕ оба операнда true
        if (!(b1 & b2)) System.out.println("!(b1 & b2): true");
        //логическое ИЛИ - если хотя бы один операнд true
        if (b1 | b2) System.out.println("(b1 | b2): true");
        //исключающее ИЛИ - если операнды разные по значению
        if (b1 ^ b2) System.out.println("(b1 ^ b2): true");
    }
}
