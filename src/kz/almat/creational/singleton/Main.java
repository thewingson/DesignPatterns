package kz.almat.creational.singleton;

public class Main {

    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.print("EagerSingleton: ");
        System.out.println(eagerSingleton == eagerSingleton2);

        System.out.println();
        System.out.println("---------------------------------");
        Thread thread = new Thread(new ThreadLazySingletonOne());
        Thread thread2 = new Thread(new ThreadLazySingletonTwo());
        System.out.println("LazySingleton: ");
        thread.start();
        thread2.start();
    }

    static class ThreadLazySingletonOne implements Runnable {
        @Override
        public void run() {
            LazySingleton singleton = LazySingleton.getInstance("FOO");
            System.out.println(singleton.value);
        }
    }

    static class ThreadLazySingletonTwo implements Runnable {
        @Override
        public void run() {
            LazySingleton singleton = LazySingleton.getInstance("BAR");
            System.out.println(singleton.value);
        }
    }
}
