package kz.almat.behavioral.chain;

public abstract class Filter {

    private Filter nextFilter;

    public Filter link(Filter filter){
        this.nextFilter = filter;
        return filter;
    }

    public void voidLink(Filter filter){
        this.nextFilter = filter;
    }

    public abstract boolean doFilter(Request request);

    protected boolean checkState(Request request){
        if(nextFilter == null){
            return true;
        }
        return nextFilter.doFilter(request);
    }

}
