package com.github.manimovassagh.springlearning.book;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class BookDaoService {
    private static List<Book> bookList=new ArrayList<Book>();

    static {
        bookList.add(new Book("Zendegi Aram", new Date(), "Sahar Morattab"));
        bookList.add(new Book("Bare Hasti", new Date(), "Mani Movassagh"));
        bookList.add(new Book("Soghoot", new Date(), "Albert Kamo"));

    }

    public List<Book> findAllBooks(){
        return bookList;
    }




}
