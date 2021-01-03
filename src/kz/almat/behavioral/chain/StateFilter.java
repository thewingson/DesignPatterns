package kz.almat.behavioral.chain;

public class StateFilter extends Filter {
    @Override
    public boolean doFilter(Request request) {
        System.out.println("it's State filter");
        if(request.getState() == State.SECURED){
            checkState(request);
        }
        return false;
    }
}
