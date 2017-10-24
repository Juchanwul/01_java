package java17.st2product;

public class Product {
    
    protected int idnum = 0;
    protected String prod = "";
    protected String producer = "";
    protected int price = 0;
    public int getIdnum() {
        return idnum;
    }
    public void setIdnum(int idnum) {
        this.idnum = idnum;
    }
    public String getProd() {
        return prod;
    }
    public void setProd(String prod) {
        this.prod = prod;
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
    public void setPrice(int i) {
        this.price = i;
    }
    @Override
    public String toString() {
        return "Product [idnum=" + idnum + ", prod=" + prod + ", producer="
                + producer + ", price=" + price + "]";
    }
    public Product(int idnum, String prod, String producer, int price) {
        super();
        this.idnum = idnum;
        this.prod = prod;
        this.producer = producer;
        this.price = price;
    }
    public Product() {
        super();
    }
    
    
    
    
}
