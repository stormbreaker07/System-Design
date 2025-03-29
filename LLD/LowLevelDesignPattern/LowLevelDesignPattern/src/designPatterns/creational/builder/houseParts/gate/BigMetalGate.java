package designPatterns.creational.builder.houseParts.gate;

public class BigMetalGate implements Gate{

    private final String metalUsedName;
    private final String gateColor;
    private final String gateDesign;
    private final int gateHeight;
    private final int gateWidth;

    public BigMetalGate(String metalUsedName, String gateColor, String gateDesign, int gateHeight, int gateWidth) {
        this.metalUsedName = metalUsedName;
        this.gateColor = gateColor;
        this.gateDesign = gateDesign;
        this.gateHeight = gateHeight;
        this.gateWidth = gateWidth;
    }

    @Override
    public String getMetalName() {
        return metalUsedName;
    }

    @Override
    public String getGateColor() {
        return gateColor;
    }

    @Override
    public String getGateDesign() {
        return gateDesign;
    }

    @Override
    public int getGateHeight() {
        return gateHeight;
    }

    @Override
    public int getGateWidth() {
        return gateWidth;
    }

    @Override
    public String toString() {
        return "BigMetalGate{" +
                "metalUsedName='" + metalUsedName + '\'' +
                ", gateColor='" + gateColor + '\'' +
                ", gateDesign='" + gateDesign + '\'' +
                ", gateHeight=" + gateHeight +
                ", gateWidth=" + gateWidth +
                '}';
    }
}
