package kz.almat.behavioral.state;

public class NewState implements State {
    @Override
    public void cancel() {
        System.out.println("Just close order");
    }
}
