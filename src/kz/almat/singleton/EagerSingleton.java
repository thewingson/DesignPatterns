package kz.almat.singleton;

/**
 *
 * */
public final class EagerSingleton {

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton(){
    }

    public static EagerSingleton getInstance(){
        return INSTANCE;
    }

}
