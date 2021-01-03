package kz.almat.behavioral.state;

public class PaidState implements State {
    @Override
    public void cancel() {
        System.out.println("Return money");
        System.out.println("Close order");
    }
}
