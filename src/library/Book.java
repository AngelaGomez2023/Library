
package library;

/**
 *
 * @author Angela 
 */
public class Book {
    private String title;
    private String autor;
    
    public Book(String title,String autor){
        this.title = title;
        this.autor = autor;
    }

    public String getTitle() {
        return title;
    }
    public String getAutor() {
        return autor;
    }
    @Override
    public String toString(){
       return "Book [title=" + title + ", author=" + autor + "]";
    }
}
