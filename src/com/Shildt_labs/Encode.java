package com.Shildt_labs;

//Использование побитовой операции исключающего ИЛИ
//для шифрования и дешифрования сообщений
public class Encode {
    public static void main(String[] args) {
        String msg = "Это просто текст";
        String encmsg = "";
        String decmsg = "";
        int key = 99;

        System.out.println("Исходное сообщение: " + msg);

        //Шифрование сообщения:
        for (int i = 0; i < msg.length(); i++) {
            //Построение зашифрованной строки сообщения
            encmsg = encmsg + (char) (msg.charAt(i) ^ key);
        }
        System.out.println("Зашифрованное сообщение: " + encmsg);

        //Дешифровка сообщения:
        for (int i = 0; i < msg.length(); i++) {
            //Построение дешифрованной строки сообщения
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key);
        }
        System.out.println("Дешифрованное сообщение: " + decmsg);

    }
}
