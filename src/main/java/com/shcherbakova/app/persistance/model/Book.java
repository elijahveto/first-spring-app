package com.shcherbakova.app.persistance.model;

import javax.persistence.*;

@Entity
public class Book{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @Column(nullable = false, unique = true)
    private String title;

    @Column(nullable = false)
    private String author;

    public Book() {}

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return String.format(
                "ID[id=%d, title='%s', author='%s']",
                id, title, author);
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title){this.title = title;};

    public void setAuthor(String author){this.author = author;}}
