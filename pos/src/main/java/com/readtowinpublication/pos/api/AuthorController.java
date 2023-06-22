package com.readtowinpublication.pos.api;

import com.readtowinpublication.pos.dto.core.AuthorDto;
import com.readtowinpublication.pos.service.AuthorService;
import com.readtowinpublication.pos.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/authors")
public class AuthorController {

    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }


    @PostMapping
    public ResponseEntity<StandardResponse> createAuthor(
            @RequestBody AuthorDto authorDto
    ) {
        var savedData = authorService.createAuthor(authorDto);
        return new ResponseEntity<>(
                new StandardResponse(201, "author saved!", savedData),
                HttpStatus.CREATED
        );
    }
}
