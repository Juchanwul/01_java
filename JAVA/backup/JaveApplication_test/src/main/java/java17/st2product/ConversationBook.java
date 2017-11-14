package java17.st2product;

public class ConversationBook extends Book {
    
    public String language = "";

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }


    public ConversationBook() {
        super();
        
    }

    @Override
    public String toString() {
        return "ConversationBook [language=" + language + ", isbn=" + isbn
                + ", writer=" + writer + ", title=" + title + ", idnum=" + idnum
                + ", prod=" + prod + ", producer=" + producer + ", price="
                + price + ", toString()=" + super.toString() + "]";
    }


    
    
}
