package com.github.manimovassagh.springlearning.book;

import java.util.Date;

public class Book {
    String bookName;
    Date publishDate;
    String bookWriter;

    public Book(String bookName, Date publishDate, String bookWriter) {
        this.bookName = bookName;
        this.publishDate = publishDate;
        this.bookWriter = bookWriter;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public String getBookWriter() {
        return bookWriter;
    }

    public void setBookWriter(String bookWriter) {
        this.bookWriter = bookWriter;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", publishDate=" + publishDate +
                ", bookWriter='" + bookWriter + '\'' +
                '}';
    }
}
