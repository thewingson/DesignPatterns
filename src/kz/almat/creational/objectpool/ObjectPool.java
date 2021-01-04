package kz.almat.creational.objectpool;

public interface ObjectPool<P extends Poolable> {

    P get();

    void release(P poolable);

}
