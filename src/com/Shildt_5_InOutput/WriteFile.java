package com.Shildt_5_InOutput;
//Запись в файл - переделала пример из Шилдта

import java.io.*;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        String str="Хочу зарплату в 150 000 рублей";
        BufferedWriter writer = new BufferedWriter(new FileWriter("CopyFile3.txt",false));

        //Сначала убедимся, что имя файла передается программе
        if(args.length !=1){
            System.out.println("Всё ОК!");
            return;
        }

        try{
                writer.write(str);
                writer.close();
        }
        catch (IOException exc){
            System.out.println("Ошибка при записи файла");
        }


    }
}
