package designPatterns.creational.singleton.threadSafe;

public class SynchronizedAtBlock {
    private static SynchronizedAtBlock INSTANCE;
    private final int value;

    private SynchronizedAtBlock(int value) {
        this.value = value;
    }

    public static SynchronizedAtBlock getInstance(int value) {
        //double check locking mechanism
        if(INSTANCE == null) {
            synchronized (SynchronizedAtBlock.class) {
                if(INSTANCE == null)
                    INSTANCE = new SynchronizedAtBlock(value);
            }
        }
        return INSTANCE;
    }

    private int getValue() {
        return this.value;
    }
}
