package com.github.manimovassagh.springlearning.book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class bookController {

    @GetMapping("/book")
    public Book getBook(){
        return new Book("Lost", new Date(), "Movasssagh");
    }


}
