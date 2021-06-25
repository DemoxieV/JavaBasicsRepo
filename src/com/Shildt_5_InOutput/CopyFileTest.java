package com.Shildt_5_InOutput;
// Копирование текстового файла - использование try с ресурсами, метод close() теперь не нужен

import java.io.*;

public class CopyFileTest {
    public static void main(String[] args) throws IOException {
        String str;

        if(args.length !=2){
            System.out.println("Всё ОК!");
            return;
        }

        try(BufferedReader reader = new BufferedReader(new FileReader("NewFile.txt"))){
            str = reader.readLine();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("CopyFile2.txt",false))) {
                writer.write(str);
                System.out.println(str);
            }
        }
        catch (IOException exc){
            System.out.println("Ошибка при чтении/ записи файла");
        }


//        try {
//            reader.close();
//            writer.close();
//        }
//        catch (IOException exc){
//            System.out.println("Ошибка при закрытии файла");
//        }

    }
}
