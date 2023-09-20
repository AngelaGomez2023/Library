
package library;

public class LibraryApp {
    public static void main(String[] args) {
        LibrarySystem librarySystem = new LibrarySystem();

        Member member1 = new Member("Alice");
        Member member2 = new Member("Bob");
        Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        librarySystem.addMember(member1);
        librarySystem.addMember(member2);
        librarySystem.lendBook(book1, member1);
        librarySystem.lendBook(book2, member2);

        System.out.println("Members: " + librarySystem.getMembers());
        System.out.println("Loans: " + librarySystem.getLoans());
    }
}
