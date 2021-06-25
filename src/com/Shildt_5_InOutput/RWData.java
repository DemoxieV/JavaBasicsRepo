package com.Shildt_5_InOutput;
//Запись и чтение двоичных данных
import java.io.*;
public class RWData {
    public static void main(String[] args) {
        int i=10;
        double d=1023.56;
        boolean b=true;

        try (DataOutputStream dataOut=new DataOutputStream(new FileOutputStream("testdata")))
        {   //Запись двоичных данных
            System.out.println("Записано: "+i);
            dataOut.writeInt(i);

            System.out.println("Записано: "+d);
            dataOut.writeDouble(d);

            System.out.println("Записано: "+b);
            dataOut.writeBoolean(b);

            System.out.println("Записано: "+12.2*7.4);
            dataOut.writeDouble(12.2*7.4);

        }
        catch (IOException e){
            System.out.println("Ошибка при записи");
            return;
        }
        System.out.println();

        try (DataInputStream dataIn=new DataInputStream(new FileInputStream("testdata")))
        {   //Считывание двоичных данных
            i= dataIn.readInt();
            System.out.println("Прочитано: "+i);

            d= dataIn.readDouble();
            System.out.println("Прочитано: "+d);

            b= dataIn.readBoolean();
            System.out.println("Прочитано: "+b);

            d= dataIn.readDouble();
            System.out.println("Прочитано: "+d);
        }
        catch (IOException e){
            System.out.println("Ошибка при чтении");
            return;
        }
    }
}
