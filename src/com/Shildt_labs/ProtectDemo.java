package com.Shildt_labs;
// доступ к переменным экземпляра title, author, pubDate запрещен,
// т.к. ProtectDemo не является подклассом Book

public class ProtectDemo {
    public static void main(String[] args) {
        ExtBook[] books = new ExtBook[5];

        books[0] = new ExtBook("Java: руководство для начинающих, 7-е издание", "Шилдт Г.", 2018, "Вильямс");
        books[1] = new ExtBook("Программирование на Java для начинающих", "Васильев А.Н.", 2020, "Эксмо");
        books[2] = new ExtBook("Java: задачи по основам программирования", "Канель Е.Г., Фрайман З.", 2020, "Ленанд");
        books[3] = new ExtBook("Алгоритмы на Java, 4-е издание", "Седжвик Р., Уэйн К.", 2019, "Диалектика");
        books[4] = new ExtBook("Java: полное руководство, 10-е издание", "Шилдт Г.", 2018, "Вильямс");

        //Поиск книг по автору
        System.out.println("Все книги Герберта Шилдта.");
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor() == "Шилдт Г.")
                System.out.println(books[i].getTitle());
        }
//        books[0].title="test title"; //Ошибка: доступ запрещен
    }
}
