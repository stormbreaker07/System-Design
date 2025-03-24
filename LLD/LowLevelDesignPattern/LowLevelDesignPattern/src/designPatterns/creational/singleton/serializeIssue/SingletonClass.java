package designPatterns.creational.singleton.serializeIssue;

import designPatterns.creational.singleton.SimpleSingletonClass;

public class SingletonClass {
    private static SingletonClass INSTANCE;
    private final int value;

    private SingletonClass(int value) {
        this.value = value;
    }

    public static SingletonClass getInstance(int value) {
        if(INSTANCE == null) {
            INSTANCE = new SingletonClass(value);
            return INSTANCE;
        }
        return INSTANCE;
    }

    private int getValue() {
        return this.value;
    }

    public Object readResolve() {
        return INSTANCE;
    }
}