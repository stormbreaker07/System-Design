package designPatterns.creational.singleton.threadSafe;

import designPatterns.creational.singleton.SimpleSingletonClass;

public class SynchronizedAtMethod {
    private static SynchronizedAtMethod INSTANCE;
    private final int value;

    private SynchronizedAtMethod(int value) {
        this.value = value;
    }

    public static synchronized SynchronizedAtMethod getInstance(int value) {
        if(INSTANCE == null) {
            INSTANCE = new SynchronizedAtMethod(value);
            return INSTANCE;
        }
        return INSTANCE;
    }

    private int getValue() {
        return this.value;
    }
}
