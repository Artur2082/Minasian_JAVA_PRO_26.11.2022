package P_Working_With_Stream_HT_19;

import java.time.LocalDate;
import java.util.Date;

public class Product {
    private String type;
    private int price;
    private boolean discount;
    private LocalDate date;

    public Product(String type, int price, boolean discount, LocalDate date) {
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isDiscount() {
        return discount;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", date=" + date +
                '}' + '\n';
    }
}
