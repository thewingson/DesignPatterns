package kz.almat.creational.objectpool;

public class RequestConnectionPool<C extends RequestConnection> extends ConnectionPool<C> {

    public RequestConnectionPool() {
        super();
        for (int i = 0; i < this.size; i++) {
            this.connections.offer((C) new RequestConnection());
        }
    }

    public RequestConnectionPool(int size) {
        super(size);
        for (int i = 0; i < this.size; i++) {
            this.connections.offer((C) new RequestConnection());
        }
    }

    @Override
    public C get() {
        return this.connections.poll();
    }

    @Override
    public void release(C connection) {
        this.connections.offer(connection);
    }
}
