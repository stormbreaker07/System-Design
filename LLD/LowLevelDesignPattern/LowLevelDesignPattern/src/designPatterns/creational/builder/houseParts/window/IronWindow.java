package designPatterns.creational.builder.houseParts.window;

public class IronWindow implements Window{

    private final String windowType;
    private final String windowMaterial;
    private final int windowPartition;

    public IronWindow(String windowType, String windowMaterial, int windowPartition) {
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
        return "IronWindow{" +
                "windowType='" + windowType + '\'' +
                ", windowMaterial='" + windowMaterial + '\'' +
                ", windowPartition=" + windowPartition +
                '}';
    }
}
