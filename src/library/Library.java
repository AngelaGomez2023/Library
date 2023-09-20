/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.ArrayList;
import java.util.List;
import javafx.beans.binding.ListBinding;

/**
 *
 * @author ag957
 */
public class Library {

    private List<Book> books;
    
    public Library(){
        books = new ArrayList<>();
    }
    
public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getBooks() {
        return books;
    }

    public boolean removeBook(Book book) {
        return books.remove(book);
    }
}
