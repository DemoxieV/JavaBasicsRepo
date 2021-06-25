package com.Shildt_5_InOutput;
//Демонстрация произвольного доступа к файлам
import java.io.*;
public class RandomAccessDemo {
    public static void main(String[] args) {
        double data[]={19.4, 10.1, 123.54, 33.0, 87.9, 74.25};
        double d;

        //Открыть и использовать файл с произвольным доступом
        try(RandomAccessFile raf=new RandomAccessFile("random.dat","rw")){
            for (int i = 0; i < data.length; i++) {
                raf.writeDouble(data[i]);
            }

            //Считывание отдельных значений из файла
            raf.seek(0); //найти первое значение типа double
            d= raf.readDouble();
            System.out.println("Первое значение: "+d);

            //Для хранения значения типа double требуется 8 байтов
            raf.seek(8); //установка указателя на файл с помощью метода seek()
            d= raf.readDouble();
            System.out.println("Второе значение: "+d);

            raf.seek(8*3); // позиция 24-ого байта
            d= raf.readDouble();
            System.out.println("Четвертое значение: "+d);

            System.out.println();

            System.out.println("Чтение значений с нечетными порядковыми номерами: ");
            for (int i = 0; i < data.length; i+=2) {
                raf.seek(8*i); //найти i-е значение типа double
                d= raf.readDouble();
                System.out.println(d+" ");
            }
        }
        catch (IOException e){
            System.out.println("Ошибка ввода-вывода: "+e);
        }
    }
}
