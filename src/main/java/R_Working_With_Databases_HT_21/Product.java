package R_Working_With_Databases_HT_21;

public class Product {
    private int id;
    private String name;
    private double price;
    private int shopID;

    public Product() {}
    public Product(int id, String name, double price, int shopID) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.shopID = shopID;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", shopID= " + shopID +
                '}';
    }
}
