package kz.almat.creational.objectpool;

public class DatabaseConnection extends Connection {
    public void select(){
        System.out.println("SELECT processed!");
    }

    public void insert(){
        System.out.println("INSERT processed!");
    }

    public void delete(){
        System.out.println("DELETE processed!");
    }

    public void update(){
        System.out.println("UPDATE processed!");
    }
}
