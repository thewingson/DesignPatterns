package kz.almat.behavioral.chain;

public class Request {

    private String protocol;
    private String status;
    private State state;

    public Request(String protocol, String status, State state) {
        this.protocol = protocol;
        this.status = status;
        this.state = state;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

}
