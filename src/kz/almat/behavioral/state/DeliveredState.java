package kz.almat.behavioral.state;

public class DeliveredState implements State {
    @Override
    public void cancel() {
        System.out.println("Return order");
        System.out.println("Return money");
        System.out.println("Close order");
    }
}
