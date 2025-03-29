package designPatterns.creational.builder.director;

import designPatterns.creational.builder.Builder;
import designPatterns.creational.builder.houseParts.gate.BigMetalGate;
import designPatterns.creational.builder.houseParts.pool.BigPool;
import designPatterns.creational.builder.houseParts.roof.BrickRoof;
import designPatterns.creational.builder.houseParts.wall.BrickWall;
import designPatterns.creational.builder.houseParts.window.WoodenWindow;

public class Director {

    public void constructBigHouse(Builder builder) {
        builder.setGate(new BigMetalGate("iron", "black", "urban", 10, 1));
        builder.setPool(new BigPool(6, 100, "aqua blue"));
        builder.setRoof(new BrickRoof("urban Strong", "concrete", 1));
        builder.setWall(new BrickWall("concrete and rock", 1));
        builder.setWindow(new WoodenWindow("old school", "oak Wooden", 2));
    }
}
