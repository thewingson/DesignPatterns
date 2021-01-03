package kz.almat.behavioral.chain;

public class StatusFilter extends Filter {
    @Override
    public boolean doFilter(Request request) {
        System.out.println("it's Status filter");
        if(request.getStatus().equals("ok") || request.getStatus().equals("redirect")){
            checkState(request);
        }
        return false;
    }
}
