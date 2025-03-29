package designPatterns.creational.builder.houseParts.wall;

public class BrickWall implements Wall{

    private final String wallMaterial;
    private final int wallThickness;

    public BrickWall(String wallMaterial, int wallThickness) {
        this.wallMaterial = wallMaterial;
        this.wallThickness = wallThickness;
    }

    @Override
    public int getWallThickness() {
        return wallThickness;
    }

    @Override
    public String getWallMaterial() {
        return wallMaterial;
    }

    @Override
    public String toString() {
        return "BrickWall{" +
                "wallMaterial='" + wallMaterial + '\'' +
                ", wallThickness=" + wallThickness +
                '}';
    }
}
