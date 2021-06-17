package com.Shildt_labs;

import com.Shildt_4_Bookpack.Book;
//Вместо импорта можно использовать полный путь и имя класса непосредственно в теле main():
// e.g.  Shildt_4_Bookpack.Book books[0]=new Shildt_4_Bookpack.Book[5]
// books[0] = new Shildt_4_Bookpack.Book("Java: руководство для начинающих, 7-е издание", "Шилдт Г.", 2018);

public class UseBookDemo {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new Book("Java: руководство для начинающих, 7-е издание", "Шилдт Г.", 2018);
        books[1] = new Book("Программирование на Java для начинающих", "Васильев А.Н.", 2020);
        books[2] = new Book("Java: задачи по основам программирования", "Канель Е.Г., Фрайман З.", 2020);
        books[3] = new Book("Алгоритмы на Java, 4-е издание", "Седжвик Р., Уэйн К.", 2019);
        books[4] = new Book("Java: полное руководство, 10-е издание", "Шилдт Г.", 2018);

        for (int i = 0; i < books.length; i++) {
            books[i].show();
        }
    }
}
