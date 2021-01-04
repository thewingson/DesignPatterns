package kz.almat.creational.objectpool;

public class Main {

    public static void main(String[] args) {
        RequestConnectionPool<RequestConnection> requestConnectionPool = new RequestConnectionPool<>(3);
        DatabaseConnectionPool<DatabaseConnection> databaseConnectionPool = new DatabaseConnectionPool<>(3);
        System.out.println(requestConnectionPool.getConnections());
        System.out.println(databaseConnectionPool.getConnections());

        System.out.println();
        RequestConnection requestConnection = requestConnectionPool.get();
        requestConnection.post();
        DatabaseConnection databaseConnection = databaseConnectionPool.get();
        databaseConnection.insert();
        System.out.println(requestConnectionPool.getConnections());
        System.out.println(databaseConnectionPool.getConnections());

        System.out.println();
        requestConnectionPool.release(requestConnection);
        databaseConnectionPool.release(databaseConnection);
        System.out.println(requestConnectionPool.getConnections());
        System.out.println(databaseConnectionPool.getConnections());
    }

}
