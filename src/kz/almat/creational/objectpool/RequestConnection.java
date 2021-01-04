package kz.almat.creational.objectpool;

public class RequestConnection extends Connection {
    public void get(){
        System.out.println("GET processed!");
    }

    public void post(){
        System.out.println("POST processed!");
    }

    public void delete(){
        System.out.println("DELETE processed!");
    }

    public void put(){
        System.out.println("PUT processed!");
    }
}
