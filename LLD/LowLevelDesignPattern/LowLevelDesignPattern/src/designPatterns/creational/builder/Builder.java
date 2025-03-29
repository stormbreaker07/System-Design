package designPatterns.creational.builder;

import designPatterns.creational.builder.house.BigHouse;
import designPatterns.creational.builder.houseParts.roof.Roof;
import designPatterns.creational.builder.houseParts.wall.Wall;
import designPatterns.creational.builder.houseParts.window.Window;
import designPatterns.creational.builder.houseParts.gate.Gate;
import designPatterns.creational.builder.houseParts.pool.Pool;

public interface Builder {


    public Wall getWall();
    public Gate getGate();
    public Pool getPool();
    public Roof getRoof();
    public Window getWindow();
    public void setWall(Wall wall);
    public void setGate(Gate gate);
    public void setPool(Pool pool);
    public void setRoof(Roof roof);
    public void setWindow(Window window);
    public BigHouse getResultHouse();
}
