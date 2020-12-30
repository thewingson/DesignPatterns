package kz.almat.Builder;

public class Pizza {

    private Integer size;
    private String cheese;
    private String topping;
    private String onion;

    public Pizza(Integer size, String cheese, String topping, String onion) {
        this.size = size;
        this.cheese = cheese;
        this.topping = topping;
        this.onion = onion;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getCheese() {
        return cheese;
    }

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getOnion() {
        return onion;
    }

    public void setOnion(String onion) {
        this.onion = onion;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", cheese='" + cheese + '\'' +
                ", topping='" + topping + '\'' +
                ", onion='" + onion + '\'' +
                '}';
    }

    public static class PizzaBuilder{
        private Integer size;
        private String cheese;
        private String topping;
        private String onion;

        public PizzaBuilder(){
        }

        public PizzaBuilder size(Integer size){
            this.size = size;
            return this;
        }

        public PizzaBuilder cheese(String cheese){
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder topping(String topping){
            this.topping = topping;
            return this;
        }

        public PizzaBuilder onion(String onion){
            this.onion = onion;
            return this;
        }

        public Pizza build(){
            return new Pizza(this.size, this.cheese, this.topping, this.onion);
        }

    }
}
