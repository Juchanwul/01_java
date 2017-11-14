package java17.st3product;

public class Book extends Product{
    
    private int isbn = 0;
    private String auth = "";
    private String  btitle = "";
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public String getAuth() {
        return auth;
    }
    public void setAuth(String auth) {
        this.auth = auth;
    }
    public String getBtitle() {
        return btitle;
    }
    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }
    @Override
    public String toString() {
        return "Book [isbn=" + isbn + ", auth=" + auth + ", btitle=" + btitle
                + "]";
    }
    public Book(int isbn, String auth, String btitle) {
        super();
        this.isbn = isbn;
        this.auth = auth;
        this.btitle = btitle;
    }
    public Book(String id, String info, String producer, int price, int isbn,
            String auth, String btitle) {
        super(id, info, producer, price);
        this.isbn = isbn;
        this.auth = auth;
        this.btitle = btitle;
    }
    public Book() {
        super();
    }
    public Book(String id, String info, String producer, int price) {
        super(id, info, producer, price);
    }
    
}
