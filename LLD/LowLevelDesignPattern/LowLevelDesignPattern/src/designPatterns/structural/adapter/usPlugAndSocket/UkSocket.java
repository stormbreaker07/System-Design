package designPatterns.structural.adapter.usPlugAndSocket;

import designPatterns.structural.adapter.enums.Shape;
import designPatterns.structural.adapter.interfaces.PlugInterface;

public class UkSocket {

    private final int frequency;
    private final int maxVoltage;
    private final Shape socketHoleShape;

    public UkSocket() {
        this.frequency = 50;
        this.maxVoltage = 230;
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
                plug.getRequiredFrequency() >= frequency &&
                plug.getPinsShape() == socketHoleShape;
    }
}
