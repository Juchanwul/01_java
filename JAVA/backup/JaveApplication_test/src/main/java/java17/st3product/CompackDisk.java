package java17.st3product;

public class CompackDisk extends Product {
    
    private String atitle = "";
    private String singer = "";
    
    public CompackDisk() {
        super();
        // TODO Auto-generated constructor stub
    }
    public CompackDisk(String id, String info, String producer, int price) {
        super(id, info, producer, price);
        // TODO Auto-generated constructor stub
    }
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
    @Override
    public String toString() {
        return "CompackDisk [atitle=" + atitle + ", singer=" + singer
                + ", toString()=" + super.toString() + "]";
    }
    
    
}
