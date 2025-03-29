package designPatterns.creational.builder.houseParts.pool;

public class BigPool implements Pool {

    private final int poolHeight;
    private final int poolArea;
    private final String baseColor;

    public BigPool(int poolHeight, int poolArea, String baseColor) {
        this.poolHeight = poolHeight;
        this.poolArea = poolArea;
        this.baseColor = baseColor;
    }

    @Override
    public int getPoolHeight() {
        return poolHeight;
    }

    @Override
    public int getPoolArea() {
        return poolArea;
    }

    @Override
    public String getBaseColor() {
        return baseColor;
    }

    @Override
    public String toString() {
        return "BigPool{" +
                "poolHeight=" + poolHeight +
                ", poolArea=" + poolArea +
                ", baseColor='" + baseColor + '\'' +
                '}';
    }
}
