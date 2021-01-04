package kz.almat.behavioral.visitor.model;

import kz.almat.behavioral.visitor.ReportVisitor;

public class Product implements Visible{

    private String name;
    private String barcode;
    private int count;

    public Product(String name, String barcode, int count) {
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

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String accept(ReportVisitor visitor) {
        return visitor.visitProductReport(this);
    }
}
