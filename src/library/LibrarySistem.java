package library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    private Library library;
    private List<Member> members;
    private List<Loan> loans;

    public LibrarySystem() { // Corregido el nombre del constructor
        library = new Library();
        members = new ArrayList<>();
        loans = new ArrayList<>();
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void lendBook(Book book, Member member) {
        if (library.removeBook(book)) {
            Loan loan = new Loan(member, book, LocalDate.now().plusWeeks(2));
            loans.add(loan);
        }
    }

    public List<Member> getMembers() {
        return members;
    }

    public List<Loan> getLoans() {
        return loans;
    }
}
