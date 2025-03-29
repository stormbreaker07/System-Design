package designPatterns.creational.builder.houseParts.roof;

public class GlassRoof implements Roof{

    private final String roofType;
    private final String roofMaterial;
    private final int roofWidth;

    public GlassRoof(String roofType, String roofMaterial, int roofWidth) {
        this.roofType = roofType;
        this.roofMaterial = roofMaterial;
        this.roofWidth = roofWidth;
    }

    @Override
    public String getRoofType() {
        return roofType;
    }

    @Override
    public String getRoofMaterial() {
        return roofMaterial;
    }

    @Override
    public int roofWidth() {
        return roofWidth;
    }

    @Override
    public String toString() {
        return "GlassRoof{" +
                "roofType='" + roofType + '\'' +
                ", roofMaterial='" + roofMaterial + '\'' +
                ", roofWidth=" + roofWidth +
                '}';
    }
}
