package kz.almat.behavioral.visitor.model;

public class Order {

    private String date;
    private String address;
    private float summ;

    public Order(String date, String address, float summ) {
        this.date = date;
        this.address = address;
        this.summ = summ;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getSumm() {
        return summ;
    }

    public void setSumm(float summ) {
        this.summ = summ;
    }
}
