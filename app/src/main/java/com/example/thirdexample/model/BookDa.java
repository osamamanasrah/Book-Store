package com.example.thirdexample.model;

import java.util.ArrayList;
import java.util.List;

class BookDa implements IBookDa {
    private ArrayList<Book> books = new ArrayList<>();

    public BookDa(){
        books.add(new Book(500,"abc Java", "Java"));
        books.add(new Book(400,"efg Java", "Java"));
        books.add(new Book(500,"abc C#", "C#"));
        books.add(new Book(400,"efg C#", "C#"));
        books.add(new Book(500,"abc Python", "Python"));
        books.add(new Book(400,"efg Python", "Python"));
    }

    @Override
    public List getBooks(String category){
        ArrayList<Book> data = new ArrayList<>();
        for(Book b:books){
            if(b.getCategory().equals(category)){
                data.add(b);
            }
        }
        return data;
    }

    @Override
    public String [] getCategories() {
        ArrayList <String> categories = new ArrayList<>();
        for(Book b: books){
            if(!categories.contains(b.getCategory())){
                categories.add(b.getCategory());
            }
        }

        String [] categoriesArray = new String[categories.size()];
        int i = 0;
        for (String s: categories){
            categoriesArray[i]=s;
            i++;
        }
        return categoriesArray;
    }
}
