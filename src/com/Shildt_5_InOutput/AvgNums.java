package com.Shildt_5_InOutput;
//Найти среднее арифметическое для чисел, введенных пользователем с клавиатуры
import java.io.*;
public class AvgNums {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n;
        double sum=0.0;
        double avg,t;

        System.out.print("Сколько чисел нужно вывести? ");
        str=br.readLine();

        try{
            n=Integer.parseInt(str);
        }
        catch (NumberFormatException e){
            System.out.println("Неверный формат");
            n=0;
        }

        System.out.println("Ввод "+n+" значений");
        for (int i = 0; i < n; i++) {
            System.out.print(": ");
            str= br.readLine();
            try{
                t=Double.parseDouble(str);
            }
            catch (NumberFormatException e){
                System.out.println("Неверный формат");
                t=0.0;
            }
            sum+=t;
        }
        avg=sum/n;
        System.out.println("Среднее значение: "+avg);
    }
}
