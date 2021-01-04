package kz.almat.creational.objectpool;

import java.util.LinkedList;
import java.util.Queue;

public abstract class ConnectionPool<C extends Connection> implements ObjectPool<C> {

    protected int size = 5;
    protected Queue<C> connections;

    public ConnectionPool() {
        this.connections = new LinkedList<>();
    }

    public ConnectionPool(int size) {
        this.connections = new LinkedList<>();
        this.size = size;
    }
    public Queue<C> getConnections(){
        return this.connections;
    }
}
