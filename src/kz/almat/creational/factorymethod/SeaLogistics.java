package kz.almat.creational.factorymethod;

public class SeaLogistics extends AbstractLogistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
