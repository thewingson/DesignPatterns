package kz.almat.structural.decorator;

public class EncryptionDecorator extends DataSourceDecorator {
    public EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(encode(data));
    }

    @Override
    public String readData() {
        return decode(super.readData());
    }

    /**
     * Imagine encoding and decoding means transform to letter cases
     * */
    private String encode(String data) {
        return data.toUpperCase();
    }

    private String decode(String data) {
        return data.toLowerCase();
    }
}
