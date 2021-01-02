package kz.almat.structural.decorator;

public class TerminalDataSource implements DataSource {

    public TerminalDataSource() {
    }

    @Override
    public void writeData(String data) {
        System.out.println("Terminal output: " + data);
    }

    @Override
    public String readData() {
        throw new UnsupportedOperationException("Method does not supported!");
    }
}
