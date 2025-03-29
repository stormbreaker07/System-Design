package designPatterns.creational.builder.houseParts.wall;

public class StoneWall implements Wall{

    private final String wallMaterial;
    private final int wallThickness;

    public StoneWall(String wallMaterial, int wallThickness) {
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
        return "StoneWall{" +
                "wallMaterial='" + wallMaterial + '\'' +
                ", wallThickness=" + wallThickness +
                '}';
    }
}
