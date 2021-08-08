package com.github.manimovassagh.springlearning.book;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

@Component
public class BookDaoService {
    private static List<Book> bookList = new ArrayList<Book>();

    static {
        bookList.add(new Book("Zendegi Aram", new Date(), "Sahar Morattab"));
        bookList.add(new Book("Bare Hasti", new Date(), "Mani Movassagh"));
        bookList.add(new Book("Soghoot", new Date(), "Albert Kamo"));

    }

    public List<Book> findAllBooks() {
        return bookList;
    }


    public Book saveBook(Book book){
        bookList.add(book);
        return book;
    }

    public Book findOneBook(String bookName){
        Stream<Book> bookResult = bookList.stream().filter(book -> book.getBookName().equals(bookName));
        return (Book) bookResult;
    }


}
