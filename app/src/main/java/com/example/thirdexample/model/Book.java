package com.example.thirdexample.model;

public class Book {
    private int numberOfPages;
    private String title;
    private String category;

    public Book() {
    }

    public Book(int numberOfPages, String title, String category) {
        this.numberOfPages = numberOfPages;
        this.title = title;
        this.category = category;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
