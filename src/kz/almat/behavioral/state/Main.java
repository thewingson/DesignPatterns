package kz.almat.behavioral.state;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();
        order.pay();
        order.deliver();
        order.cancel();
    }
}
