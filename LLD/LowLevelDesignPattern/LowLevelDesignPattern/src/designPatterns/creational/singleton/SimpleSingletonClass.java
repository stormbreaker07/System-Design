package designPatterns.creational.singleton;

public class SimpleSingletonClass {

    private static SimpleSingletonClass INSTANCE;
    private final int value;

    private SimpleSingletonClass(int value) {
        this.value = value;
    }

    public static SimpleSingletonClass getInstance(int value) {
        if(INSTANCE == null) {
            INSTANCE = new SimpleSingletonClass(value);
            return INSTANCE;
        }
        return INSTANCE;
    }

    private int getValue() {
        return this.value;
    }
}
