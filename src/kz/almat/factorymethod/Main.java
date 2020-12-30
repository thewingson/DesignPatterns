package kz.almat.factorymethod;

public class Main {

    public static void main(String[] args) {
        deliverPost(new RoadLogistics());
        deliverPost(new SeaLogistics());
    }

    public static void deliverPost(AbstractLogistics logistics) {
        logistics.deliver();
    }

}
