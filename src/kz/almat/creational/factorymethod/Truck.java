package kz.almat.creational.factorymethod;

public class Truck extends Transport {
    @Override
    public void deliver() {
        System.out.println("Truck delivers by the road");
    }
}
