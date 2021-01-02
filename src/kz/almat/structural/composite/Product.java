package kz.almat.structural.composite;

public class Product implements Countable{

    private Integer price;

    public Product(Integer price) {
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public Integer calculate() {
        return this.price;
    }
}
