package com.Shildt_5_InOutput;
//Простая утилита для чтения данных с диска и вывода их на экран - класс FileReader
import java.io.*;
public class DtoS {
    public static void main(String[] args) {
        String s;

        try(BufferedReader br=new BufferedReader(new FileReader("NewFile.txt")))
        {
            while ((s=br.readLine())!=null){
                System.out.println(s);
            }
        }
        catch (IOException e){
            System.out.println("Ошибка ввода-вывода: "+e);
        }
    }
}
