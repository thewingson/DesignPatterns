package kz.almat.prototype;

public class Cat extends Animal {

    public Cat(String color, String name) {
        this.color = color;
        this.name = name;
    }

    @Override
    public Animal clone() {
        return new Cat(this.color, this.name);
    }
}
