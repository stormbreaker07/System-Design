package designPatterns.creational.builder.houseParts.window;

public class WoodenWindow implements Window{

    private final String windowType;
    private final String windowMaterial;
    private final int windowPartition;

    public WoodenWindow(String windowType, String windowMaterial, int windowPartition) {
        this.windowType = windowType;
        this.windowMaterial = windowMaterial;
        this.windowPartition = windowPartition;
    }

    @Override
    public String GetWindowType() {
        return windowType;
    }

    @Override
    public int getWindowPartition() {
        return windowPartition;
    }

    @Override
    public String getWindowMaterial() {
        return windowMaterial;
    }

    @Override
    public String toString() {
        return "WoodenWindow{" +
                "windowType='" + windowType + '\'' +
                ", windowMaterial='" + windowMaterial + '\'' +
                ", windowPartition=" + windowPartition +
                '}';
    }
}
