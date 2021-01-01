package kz.almat.structural.adapter;

public class MessageObjectAdapter implements Message32bit {

    private Message64bit instance;

    public MessageObjectAdapter(Message64bit instance) {
        this.instance = instance;
    }

    @Override
    public String getResult32bit() {
        return instance.getMessage().toLowerCase();
    }
}
