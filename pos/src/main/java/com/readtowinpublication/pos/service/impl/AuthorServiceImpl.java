package com.readtowinpublication.pos.service.impl;

import com.readtowinpublication.pos.dto.core.AuthorDto;
import com.readtowinpublication.pos.entity.Author;
import com.readtowinpublication.pos.repo.AuthorRepo;
import com.readtowinpublication.pos.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepo authorRepo;

    @Autowired
    public AuthorServiceImpl(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
    }

    @Override
    public Author createAuthor(AuthorDto dto) {
        Author author = new Author(
                0,
                dto.getFirstName(),
                dto.getLastName(),
                dto.getEmail(),
                dto.getContactNo()
        );
        authorRepo.save(author
        );

        return author;
    }
}
