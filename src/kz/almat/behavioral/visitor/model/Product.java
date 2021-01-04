package kz.almat.behavioral.visitor.model;

public class Product {

    private String name;
    private String barcode;
    private short count;

    public Product(String name, String barcode, short count) {
        this.name = name;
        this.barcode = barcode;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public short getCount() {
        return count;
    }

    public void setCount(short count) {
        this.count = count;
    }
}
