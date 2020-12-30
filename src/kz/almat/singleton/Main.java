package kz.almat.singleton;

public class Main {

    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.print("Are singleton instances the same? ");
        System.out.println(eagerSingleton == eagerSingleton2);
    }
}
