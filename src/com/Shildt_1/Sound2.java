package com.Shildt_1;

/* Рассчитать расстояние до крупного объекта, например скалы, можно по времени прихода эхо.
Сделать на основании программы Sound2.*/
public class Sound2 {
    public static void main(String[] args) {
        //  Буду считать, что исходное время от меня до объекта = 10 сек. Рассчитываем время эхо:
        int echo_time = 10 / 2;
        //  Скорость звука будем считать в м/с. 1100 фут/с (330 м/с)
        int sound_speed = 330;
        double dist = echo_time * sound_speed;
        System.out.println("Расстояние до скалы составляет " + dist + " метров");
    }
}
