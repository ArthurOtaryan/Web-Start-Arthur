package com.smartcode.web.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class Comment {



    private String title;
    private String description;
    private Integer User_id;



    @Override
    public String toString() {
        return "Comment{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
