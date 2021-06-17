package com.Shildt_2;

// Попытайтесь видоизменить программу так, чтобы вместо логических значений true и false отображались значения 1 и 0
public class LogicalOpTableNew {
    public static void main(String[] args) {
        boolean p, q;
        System.out.println("P\t\tQ\t\tAND\t\tOR\t\tXOR\t\tNOT");

        p = true;
        q = true;
        if (p) System.out.print(1 + "\t\t");
        else System.out.print(0 + "\t\t");
        if (q) System.out.print(1 + "\t\t");
        else System.out.print(0 + "\t\t");
        if (p & q) System.out.print(1 + "\t\t");
        else System.out.print(0 + "\t\t");
        if (p | q) System.out.print(1 + "\t\t");
        else System.out.print(0 + "\t\t");
        if (p ^ q) System.out.print(1 + "\t\t");
        else System.out.print(0 + "\t\t");
        if (!p) System.out.println(1 + "\t\t");
        else System.out.println(0 + "\t\t");

        p = true;
        q = false;
        if (p) System.out.print(1 + "\t\t");
        else System.out.print(0 + "\t\t");
        if (q) System.out.print(1 + "\t\t");
        else System.out.print(0 + "\t\t");
        if (p & q) System.out.print(1 + "\t\t");
        else System.out.print(0 + "\t\t");
        if (p | q) System.out.print(1 + "\t\t");
        else System.out.print(0 + "\t\t");
        if (p ^ q) System.out.print(1 + "\t\t");
        else System.out.print(0 + "\t\t");
        if (!p) System.out.println(1 + "\t\t");
        else System.out.println(0 + "\t\t");


        p = false;
        q = true;
        int res1 = (p) ? 1 : 0;
        System.out.print(res1 + "\t\t");
        res1 = (q) ? 1 : 0;
        System.out.print(res1 + "\t\t");
        res1 = (p & q) ? 1 : 0;
        System.out.print(res1 + "\t\t");
        res1 = (p | q) ? 1 : 0;
        System.out.print(res1 + "\t\t");
        res1 = (p ^ q) ? 1 : 0;
        System.out.print(res1 + "\t\t");
        res1 = (!p) ? 1 : 0;
        System.out.println(res1 + "\t\t");

        p = false;
        q = false;
        if (p) System.out.print(1 + "\t\t");
        else System.out.print(0 + "\t\t");
        if (q) System.out.print(1 + "\t\t");
        else System.out.print(0 + "\t\t");
        if (p & q) System.out.print(1 + "\t\t");
        else System.out.print(0 + "\t\t");
        if (p | q) System.out.print(1 + "\t\t");
        else System.out.print(0 + "\t\t");
        if (p ^ q) System.out.print(1 + "\t\t");
        else System.out.print(0 + "\t\t");
        if (!p) System.out.println(1 + "\t\t");
        else System.out.println(0 + "\t\t");
    }
}
