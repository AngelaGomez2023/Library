/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.time.LocalDate;

/**
 *
 * @author ag957
 */
public class Loan {
    private Member member;
    private Book book;
    private LocalDate dueDate;
    
    public Loan(Member member,Book book,LocalDate dueDate){
        this.book = book;
        this.member = member;
        this.dueDate = this.dueDate;
    }

    public Member getMember() {
        return member;
    }

    public Book getBook() {
        return book;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }
    
    
}
