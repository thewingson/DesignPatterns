package kz.almat.behavioral.state;

public class CancelledState implements State {
    @Override
    public void cancel() {
        throw new UnsupportedOperationException("This operation is not supported by this state!");
    }
}
