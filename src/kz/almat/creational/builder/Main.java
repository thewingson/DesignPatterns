package kz.almat.creational.builder;

public class Main {

    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder().size(15).cheese("bolonese").onion("red").topping("salami").build();
        System.out.println(pizza);

        House house = new ChineseHouseBuilder().setWalls("walls").setDoors("doors").setWindows("windows").build();
        System.out.println(house);
        House house2 = new KazakhHouseBuilder().setWalls("walls").setDoors("doors").setWindows("windows").build();
        System.out.println(house2);
    }

}
