package com.readtowinpublication.pos.service.impl;

import com.readtowinpublication.pos.dto.core.BookDto;
import com.readtowinpublication.pos.entity.Book;
import com.readtowinpublication.pos.repo.BookRepo;
import com.readtowinpublication.pos.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class BookServiceImpl implements BookService {

    private final BookRepo bookRepo;

    @Autowired
    public BookServiceImpl(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public Book createBook(BookDto dto) {
        Book book = new Book(
                dto.getIsbn(),
                dto.getCategory(),
                dto.getTitle()
        );

        bookRepo.save(book);

        return book;
    }

    @Override
    public Book findBook(String id) {
        return null;
    }
}
