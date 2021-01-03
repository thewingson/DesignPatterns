package kz.almat.behavioral.chain;

public class ProtocolFilter extends Filter {
    @Override
    public boolean doFilter(Request request) {
        System.out.println("it's Protocol filter");
        if(request.getProtocol().equals("http")){
            checkState(request);
        }
        return false;
    }
}
