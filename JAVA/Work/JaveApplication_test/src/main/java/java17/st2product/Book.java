package java17.st2product;

public class Book extends Product {
    
    public int isbn = 0;
    public String writer = "";
    public String title = "";
    
    public int getisbn() {
        return isbn;
    }
    public void setisbn(int isbn) {
        this.isbn = isbn;
    }
    public String getwriter() {
        return writer;
    }
    public void setwriter(String writer) {
        this.writer = writer;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Book() {
        super();
        
    }
    @Override
    public String toString() {
        return "Book [isbn=" + isbn + ", writer=" + writer + ", title=" + title
                + ", idnum=" + idnum + ", prod=" + prod + ", producer="
                + producer + ", price=" + price + ", toString()="
                + super.toString() + "]";
    }

    
}
