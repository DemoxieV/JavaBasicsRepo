package com.Shildt_5_InOutput;
//Использование класса BufferedReader для чтения символов с консоли
import java.io.*;
public class ReadChars {
    public static void main(String[] args) throws IOException{
        char c;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите символы, окончание ввода - символ точки");

        //считывание символов
        do{
            c=(char) br.read();
            System.out.println(c);
        } while (c!='.');
    }
}
