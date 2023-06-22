package com.readtowinpublication.pos.service;

import com.readtowinpublication.pos.dto.core.AuthorDto;
import com.readtowinpublication.pos.entity.Author;

public interface AuthorService {

    public Author createAuthor(AuthorDto dto);
}
