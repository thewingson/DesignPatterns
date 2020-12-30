package kz.almat.factorymethod;

public class Ship extends Transport {
    @Override
    public void deliver() {
        System.out.println("Ship delivers by the sea");
    }
}
