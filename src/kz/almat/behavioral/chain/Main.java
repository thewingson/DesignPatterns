package kz.almat.behavioral.chain;

public class Main {

    public static void main(String[] args) {
        Request request = new Request("http", "ok", State.SECURED);

//        Filter protocolFilter = new ProtocolFilter();
//        Filter stateFilter = new StateFilter();
//        Filter statusFilter = new StatusFilter();
//        protocolFilter.voidLink(stateFilter);
//        stateFilter.voidLink(statusFilter);
//
//        protocolFilter.doFilter(request);

        Filter filter = new ProtocolFilter();
        filter
                .link(new StatusFilter())
                .link(new StateFilter());

        filter.doFilter(request);

    }

}
