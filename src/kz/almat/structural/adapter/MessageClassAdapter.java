package kz.almat.structural.adapter;

public class MessageClassAdapter extends Message64bit implements Message32bit {
    public MessageClassAdapter(String message) {
        super(message);
    }

    public MessageClassAdapter(Message64bit instance) {
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
