package kz.almat.creational.prototype;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat("black", "Tom");
        Animal clone = cat.clone();
        System.out.println(cat == clone);
        System.out.println(cat.equals(clone));
    }

}
