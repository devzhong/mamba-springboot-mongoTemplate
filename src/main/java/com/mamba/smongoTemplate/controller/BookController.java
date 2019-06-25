package com.mamba.smongoTemplate.controller;

import com.mamba.smongoTemplate.entity.Book;
import com.mamba.smongoTemplate.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * desc:
 * author:devzhong
 * Date:2019/6/25 14:35
 */
@RestController
@RequestMapping(value = "/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/addBook", method = RequestMethod.POST)
    public String addBook(@RequestBody Book book){
        return bookService.saveObj(book);
    }
}
