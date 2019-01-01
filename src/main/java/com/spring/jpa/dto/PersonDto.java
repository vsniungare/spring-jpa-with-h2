package com.spring.jpa.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class PersonDto {
    @NotNull
    private String fname;
    @NotNull
    private String lname;
    @NotNull
    private int contact;
}