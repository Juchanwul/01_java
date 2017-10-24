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
        return "ConversationBook [language=" + language + ", toString()="
                + super.toString() + "]";
    }

    
    
}
