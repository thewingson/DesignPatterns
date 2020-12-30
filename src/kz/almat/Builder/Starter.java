package kz.almat.Builder;

public class Starter {

    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder().size(15).cheese("bolonese").onion("red").topping("salami").build();
        System.out.println(pizza);

        House house = new ChineseHouseBuilder().setWalls("walls").setDoors("doors").setWindows("windows").build();
        System.out.println(house);
    }

}
