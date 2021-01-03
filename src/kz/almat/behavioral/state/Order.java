package kz.almat.behavioral.state;

public class Order {

    private State currentState;

    public Order() {
        this.currentState = new NewState();
    }

    public void pay() throws UnsupportedOperationException{
        this.currentState = new PaidState();
    }

    public void deliver() throws UnsupportedOperationException{
        this.currentState = new DeliveredState();
    }

    public void cancel() throws UnsupportedOperationException{
        this.currentState.cancel();
        this.currentState = new CancelledState();
    }
}
