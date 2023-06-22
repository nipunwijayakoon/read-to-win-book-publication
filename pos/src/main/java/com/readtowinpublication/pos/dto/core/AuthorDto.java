package com.readtowinpublication.pos.dto.core;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AuthorDto {

    private String firstName;
    private String lastName;
    private String email;
    private String contactNo;
}
