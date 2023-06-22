package com.readtowinpublication.pos.service;

import com.readtowinpublication.pos.dto.core.BookDto;
import com.readtowinpublication.pos.entity.Book;

public interface BookService {

    public Book createBook(BookDto dto);
    public Book findBook(String id);
}
