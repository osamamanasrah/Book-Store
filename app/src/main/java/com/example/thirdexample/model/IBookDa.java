package com.example.thirdexample.model;

import java.util.List;

public interface IBookDa {

    List getBooks(String category);
    String [] getCategories();
}
