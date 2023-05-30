package com.example.demo.entity;

public class Book {
    private long id;
    private String type;
    private String bookName;
    private String bookImg;
    private String author;

    public Book(long id, String bookName, String bookImg, String author, String type) {
        this.id = id;
        this.type = type;
        this.bookName = bookName;
        this.bookImg = bookImg;
        this.author = author;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookImg() {
        return bookImg;
    }

    public void setBookImg(String bookImg) {
        this.bookImg = bookImg;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
