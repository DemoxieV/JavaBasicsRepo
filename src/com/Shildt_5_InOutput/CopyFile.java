package com.Shildt_5_InOutput;
// Копирование текстового файла - сделала сама

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        String str;
        BufferedReader reader = new BufferedReader(new FileReader("NewFile.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("CopyFile.txt",false));

        if(args.length !=2){
            System.out.println("Всё ОК!");
            return;
        }

        try{
            str=reader.readLine();
            writer.write(str);
            System.out.println(str);
        }
        catch (IOException exc){
            System.out.println("Ошибка при чтении/ записи файла");
        }


        try {
            reader.close();
            writer.close();
        }
        catch (IOException exc){
            System.out.println("Ошибка при закрытии файла");
        }

    }
}
