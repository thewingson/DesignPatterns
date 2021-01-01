package kz.almat.structural;

public class MessageAdapter extends Message64bit implements Message32bit {
    public MessageAdapter(String message) {
        super(message);
    }

    public MessageAdapter(Message64bit instance) {
        super(instance.getMessage());
    }

    /**
     * Imagine result in 32bit means translation
     * to lower case letters and 64bit does not
     * have the same functionality.
     * */
    @Override
    public String getResult32bit() {
        return getMessage().toLowerCase();
    }
}
