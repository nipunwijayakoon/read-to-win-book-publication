package com.readtowinpublication.pos.dto.core;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookDto {

    private String isbn;
    private String category;
    private String title;

    private int authorId;

}
