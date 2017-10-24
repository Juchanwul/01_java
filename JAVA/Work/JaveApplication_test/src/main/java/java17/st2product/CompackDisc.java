package java17.st2product;

public class CompackDisc extends Product {
    
    public String atitle = "";
    public String singer = "";
    
    public String getAtitle() {
        return atitle;
    }
    public void setAtitle(String atitle) {
        this.atitle = atitle;
    }
    public String getSinger() {
        return singer;
    }
    public void setSinger(String singer) {
        this.singer = singer;
    }

    
    public CompackDisc() {
        super();
        
    }
    @Override
    public String toString() {
        return "CompackDisc [atitle=" + atitle + ", singer=" + singer
                + ", toString()=" + super.toString() + "]";
    }

}
