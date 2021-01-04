package kz.almat.creational.objectpool;

public class DatabaseConnectionPool<C extends DatabaseConnection> extends ConnectionPool<C> {

    public DatabaseConnectionPool() {
        super();
        for (int i = 0; i < this.size; i++) {
            this.connections.offer((C) new DatabaseConnection());
        }
    }

    public DatabaseConnectionPool(int size) {
        super(size);
        for (int i = 0; i < this.size; i++) {
            this.connections.offer((C) new DatabaseConnection());
        }
    }

    @Override
    public C get() {
        if (!this.connections.isEmpty()) {
            return this.connections.poll();
        }
        return null;
    }

    @Override
    public void release(C connection) {
        this.connections.offer(connection);
    }
}
