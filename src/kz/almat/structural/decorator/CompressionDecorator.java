package kz.almat.structural.decorator;

public class CompressionDecorator extends DataSourceDecorator {
    public CompressionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(compress(data));
    }

    @Override
    public String readData() {
        return decompress(super.readData());
    }


    private String compress(String data) {
        return data.substring(0, data.length()/2);
    }

    private String decompress(String data) {
        return data + data;
    }
}
