package com.readtowinpublication.pos.api;

import com.readtowinpublication.pos.dto.core.BookDto;
import com.readtowinpublication.pos.service.BookService;
import com.readtowinpublication.pos.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<StandardResponse> createBook(
            @RequestBody BookDto bookDto
    ) {
        var savedData = bookService.createBook(bookDto);
        return new ResponseEntity<>(
                new StandardResponse(201, "book saved!", savedData),
                HttpStatus.CREATED
        );
    }
}
