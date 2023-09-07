package com.smartcode.web.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor

public class Comment {
    public Comment(String title, String description, Integer user_id) {
        this.title = title;
        this.description = description;
        User_id = user_id;
    }
private Integer id;
    private String title;
    private String description;
    private Integer User_id;
}
