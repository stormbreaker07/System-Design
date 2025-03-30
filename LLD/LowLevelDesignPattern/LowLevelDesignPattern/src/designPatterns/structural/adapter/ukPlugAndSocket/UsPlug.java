package designPatterns.structural.adapter.ukPlugAndSocket;

import designPatterns.structural.adapter.enums.Shape;
import designPatterns.structural.adapter.interfaces.PlugInterface;

//plug is something that is connected to our device that need power to run
public class UsPlug implements PlugInterface {

    private int requiredFrequency;
    private int requiredPower;
    private Shape pinsShape;

    public UsPlug() {
    }

    public UsPlug(int requiredFrequency, int requiredPower) {
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
