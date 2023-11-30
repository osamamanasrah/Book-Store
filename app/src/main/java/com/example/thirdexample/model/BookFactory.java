package com.example.thirdexample.model;

public class BookFactory {
    public IBookDa getModel(){
        return new BookDa();
    }
}
