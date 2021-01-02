package kz.almat.structural.decorator;

public class Main {

    public static void main(String[] args) {
        String record = "this is record";
        DataSourceDecorator decorator = new EncryptionDecorator(new TerminalDataSource());
        decorator.writeData(record);

        DataSourceDecorator decorator2 = new CompressionDecorator(new TerminalDataSource());
        decorator2.writeData(record);

        decorator2 = new EncryptionDecorator(decorator2);
        decorator2.writeData(record);
    }

}
