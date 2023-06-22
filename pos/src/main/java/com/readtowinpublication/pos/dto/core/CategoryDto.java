package com.readtowinpublication.pos.dto.core;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CategoryDto {

    private int authorId;
    private int categoryId;
    private String categoryName;
}
