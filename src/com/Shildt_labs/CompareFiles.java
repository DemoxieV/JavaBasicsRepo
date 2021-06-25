package com.Shildt_labs;
// Утилита сравнения файлов
import java.io.*;
public class CompareFiles {
    public static void main(String[] args) {
        int i=0, j=0;

        //Программе передаются имена обоих файлов
        if(args.length!=2){
            System.out.println("Всё ОК!");
            return;
        }

        //Сравнение файлов
        try(FileInputStream f1=new FileInputStream("CopyFile.txt");
            FileInputStream f2=new FileInputStream("CopyFile3.txt"))
        {
            //Проверка содержимого каждого файла
            do {
                i=f1.read();
                j=f2.read();
                if(i != j) break;
            } while(i!=-1 && j!=-1);

            if(i!=j)
                System.out.println("Содержимое файлов отличается");
            else
                System.out.println("Содержимое файлов совпадает");
        }
        catch (IOException e){
            System.out.println("Ошибка ввода-вывода: "+e);
        }

    }
}
