package designPatterns.structural.adapter.ukPlugAndSocket;

import designPatterns.structural.adapter.enums.Shape;
import designPatterns.structural.adapter.interfaces.PlugInterface;

public class UsSocket {

    private final int frequency;
    private final int maxVoltage;
    private final Shape socketHoleShape;

    public UsSocket() {
        this.frequency = 60;
        this.maxVoltage = 120;
        this.socketHoleShape = Shape.FLAT;
    }

    public int getFrequency() {
        return frequency;
    }

    public int getMaxVoltage() {
        return maxVoltage;
    }

    public Shape getSocketHoleShape() {
        return socketHoleShape;
    }

    public boolean isPlugValid(PlugInterface plug) {
        return plug.getRequiredPower() <= maxVoltage &&
                plug.getRequiredFrequency() <= frequency &&
                plug.getPinsShape() == socketHoleShape;
    }
}
