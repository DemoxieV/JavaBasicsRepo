package com.Shildt_labs;
//Пример использования модификатора protected
//ExtBook является подклассом Book, хоть он в другом пакете, имеет доступ
//к переменным экземпляра title, author, pubDate

import com.Shildt_4_Bookpack.Book;

public class ExtBook extends Book {
    private String publisher;

    public ExtBook(String t, String a, int d, String p) {
        super(t, a, d);
        publisher = p;
    }

    public void show() {
        super.show();
        System.out.println(publisher);
        System.out.println();
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String p) {
        publisher = p;
    }

    //Следующие инструкции допустимы, т.к. подклассы имеют право доступа к protected-членам класса
    public String getTitle() {
        return title;
    }

    public void setTitle(String t) {
        title = t;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public int getPubDate() {
        return pubDate;
    }

    public void setPubDate(int p) {
        pubDate = p;
    }
}
