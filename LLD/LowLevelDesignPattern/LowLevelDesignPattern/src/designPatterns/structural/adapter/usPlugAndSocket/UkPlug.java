package designPatterns.structural.adapter.usPlugAndSocket;

import designPatterns.structural.adapter.enums.Shape;
import designPatterns.structural.adapter.interfaces.PlugInterface;

public class UkPlug implements PlugInterface {

    private int requiredFrequency;
    private int requiredPower;
    private Shape pinsShape;

    public UkPlug() {

    }

    public UkPlug(int requiredFrequency, int requiredPower) {
        this.requiredFrequency = requiredFrequency;
        this.requiredPower = requiredPower;
        this.pinsShape = Shape.FLAT;
    }

    public int getRequiredFrequency() {
        return requiredFrequency;
    }

    public int getRequiredPower() {
        return requiredPower;
    }

    public Shape getPinsShape() {
        return pinsShape;
    }
}
