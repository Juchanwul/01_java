package java17.st3product;

public class ConversationBook extends Book {
    
    private String lang = "";

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public String toString() {
        return "ConversationBook [lang=" + lang + "]";
    }

    public ConversationBook() {
        super();
        // TODO Auto-generated constructor stub
    }

    public ConversationBook(int isbn, String auth, String btitle) {
        super(isbn, auth, btitle);
        // TODO Auto-generated constructor stub
    }

    public ConversationBook(String id, String info, String producer, int price,
            int isbn, String auth, String btitle) {
        super(id, info, producer, price, isbn, auth, btitle);
        // TODO Auto-generated constructor stub
    }

    public ConversationBook(String id, String info, String producer,
            int price) {
        super(id, info, producer, price);
        // TODO Auto-generated constructor stub
    }
    
}
