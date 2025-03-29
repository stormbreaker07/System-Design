package designPatterns.creational.builder.house;

import designPatterns.creational.builder.houseParts.gate.Gate;
import designPatterns.creational.builder.houseParts.pool.Pool;
import designPatterns.creational.builder.houseParts.roof.Roof;
import designPatterns.creational.builder.houseParts.wall.Wall;
import designPatterns.creational.builder.houseParts.window.Window;

public class BigHouse {

    private Wall wall;
    private Gate gate;
    private Pool pool;
    private Roof roof;
    private Window window;

    public BigHouse() {

    }

    public BigHouse(Wall wall, Gate gate, Pool pool, Roof roof, Window window) {
        this.wall = wall;
        this.gate = gate;
        this.pool = pool;
        this.roof = roof;
        this.window = window;
    }

    public Wall getWall() {
        return wall;
    }

    public void setWall(Wall wall) {
        this.wall = wall;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Pool getPool() {
        return pool;
    }

    public void setPool(Pool pool) {
        this.pool = pool;
    }

    public Roof getRoof() {
        return roof;
    }

    public void setRoof(Roof roof) {
        this.roof = roof;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    @Override
    public String toString() {
        return "BigHouse{" +
                "wall=" + wall +
                ", gate=" + gate +
                ", pool=" + pool +
                ", roof=" + roof +
                ", window=" + window +
                '}';
    }
}
