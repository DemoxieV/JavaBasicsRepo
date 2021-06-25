package com.Shildt_5_InOutput;
// Отображение текстового файла - переделала пример из Шилдта
import java.io.*;

public class ShowFile {
    public static void main(String[] args) throws FileNotFoundException {
        String str;
        BufferedReader reader = new BufferedReader(new FileReader(args[0]));

        //Сначала убедимся, что имя файла передается программе
        if(args.length !=1){
            System.out.println("Использование: ShowFile");
            return;
        }

        try{
            str=reader.readLine();
            System.out.println(str);
        }
        catch (IOException exc){
            System.out.println("Ошибка при чтении файла");
        }

        try {
            reader.close(); //Закрытие файла
        }
        catch (IOException exc){
            System.out.println("Ошибка при закрытии файла");
        }

    }
}
