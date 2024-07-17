package com.telusko.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Blog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int blogId;
    private String blogTitle;
    @Lob
    private String content;
    private String authorName;
    private String category;
}
