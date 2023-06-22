package com.readtowinpublication.pos.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    private String isbn;
    private String category;
    private String title;

}
