package java17.st3product;

public class Product {
    
    private String id = "";
    private String info = "";
    private String producer = "";
    private int price = 0;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
    public String getProducer() {
        return producer;
    }
    public void setProducer(String producer) {
        this.producer = producer;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product [id=" + id + ", info=" + info + ", producer=" + producer
                + ", price=" + price + "]";
    }
    public Product(String id, String info, String producer, int price) {
        super();
        this.id = id;
        this.info = info;
        this.producer = producer;
        this.price = price;
    }
    public Product() {
        super();
    }
    
    
}
