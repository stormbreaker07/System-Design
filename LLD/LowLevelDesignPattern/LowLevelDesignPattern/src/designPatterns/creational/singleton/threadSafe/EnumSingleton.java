package designPatterns.creational.singleton.threadSafe;

public enum EnumSingleton {

    INSTANCE;
    private final String connection;

    EnumSingleton() {
        connection = "yes we get the database connection";
    }

    public String getConnection() {
        return connection;
    }
}
