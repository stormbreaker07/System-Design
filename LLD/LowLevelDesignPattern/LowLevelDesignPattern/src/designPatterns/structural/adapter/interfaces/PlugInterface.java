package designPatterns.structural.adapter.interfaces;

import designPatterns.structural.adapter.enums.Shape;

public interface PlugInterface {

    int getRequiredFrequency();

    int getRequiredPower();

    Shape getPinsShape();
}
