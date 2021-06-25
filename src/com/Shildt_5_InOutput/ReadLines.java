package com.Shildt_5_InOutput;
//Использование класса BufferedReader для чтения строк

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadLines {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str;

        System.out.println("Введите текстовые строки, окончание ввода - строка 'stop'");

        //считывание символов
        do{
            str=br.readLine();
            System.out.println(str);
        } while (str!="stop");
    }
}
