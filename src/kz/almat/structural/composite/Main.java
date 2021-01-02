package kz.almat.structural.composite;

public class Main {

    public static void main(String[] args) {
        Product product = new Product(10);
        Product product1 = new Product(20);
        Product product2 = new Product(30);
        Product product3 = new Product(40);
        Product product4 = new Product(50);
        Product product5 = new Product(60);
        Product product6 = new Product(70);

        Category category = new CategoryBuilder().addItem(product).addItem(product1).build();
        Category category1 = new CategoryBuilder().addItem(product2).addItem(product3).build();
        Category category2 = new CategoryBuilder().addItem(product4).build();
        Category category3 = new CategoryBuilder().addItem(category).addItem(category1).addItem(product5).build();
        Category category4 = new CategoryBuilder().addItem(product6).addItem(category2).addItem(category3).build();
        System.out.println("Total price: " + category4.calculate());

    }

}
