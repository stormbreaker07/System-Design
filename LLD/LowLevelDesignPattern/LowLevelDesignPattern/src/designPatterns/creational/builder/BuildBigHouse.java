package designPatterns.creational.builder;

import designPatterns.creational.builder.house.BigHouse;
import designPatterns.creational.builder.houseParts.gate.Gate;
import designPatterns.creational.builder.houseParts.pool.Pool;
import designPatterns.creational.builder.houseParts.roof.Roof;
import designPatterns.creational.builder.houseParts.wall.Wall;
import designPatterns.creational.builder.houseParts.window.Window;

public class BuildBigHouse implements Builder{

    private final BigHouse house;

    public BuildBigHouse() {
        house = new BigHouse();
    }

    @Override
    public Wall getWall() {
        return house.getWall();
    }

    @Override
    public Gate getGate() {
        return house.getGate();
    }

    @Override
    public Pool getPool() {
        return house.getPool();
    }

    @Override
    public Roof getRoof() {
        return house.getRoof();
    }

    @Override
    public Window getWindow() {
        return house.getWindow();
    }

    @Override
    public void setWall(Wall wall) {
        this.house.setWall(wall);
    }

    @Override
    public void setGate(Gate gate) {
        this.house.setGate(gate);
    }

    @Override
    public void setPool(Pool pool) {
        this.house.setPool(pool);
    }

    @Override
    public void setRoof(Roof roof) {
        this.house.setRoof(roof);
    }

    @Override
    public void setWindow(Window window) {
        this.house.setWindow(window);
    }

    @Override
    public BigHouse getResultHouse() {
        return house;
    }
}
