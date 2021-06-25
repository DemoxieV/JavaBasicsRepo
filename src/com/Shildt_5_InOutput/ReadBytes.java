package com.Shildt_5_InOutput;
//Чтение байтов с клавиатуры в массив (чтение байтов с потока ввода System.in в массив)
import java.io.*;
public class ReadBytes {
    public static void main(String[] args) throws IOException{
        byte data[]=new byte[10];
        System.out.println("Введите символы: ");
        System.in.read(data); //чтение байтового массива с клавиатуры
        System.out.println("Вы ввели:");
        for (int i = 0; i < data.length; i++) {
            System.out.print((char) data[i]);
        }
    }
}
