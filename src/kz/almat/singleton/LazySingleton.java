package kz.almat.singleton;

public final class LazySingleton {

    public static volatile LazySingleton INSTANCE;

    public String value;

    private LazySingleton(String value){
        this.value = value;
    }

    public static LazySingleton getInstance(String value){
        LazySingleton result = INSTANCE;
        if (result != null) {
            return result;
        }
        synchronized(LazySingleton.class) {
            if (INSTANCE == null) {
                INSTANCE = new LazySingleton(value);
            }
            return INSTANCE;
        }
    }

}
