package designPatterns.structural.adapter.plugAdapters;

import designPatterns.structural.adapter.enums.Shape;
import designPatterns.structural.adapter.ukPlugAndSocket.UsPlug;
import designPatterns.structural.adapter.usPlugAndSocket.UkPlug;

public class UsToUkSocketAdapter extends UkPlug {
    private final UsPlug usPlug;
    private final Shape pinShapeConverter = Shape.ROUND;

    public UsToUkSocketAdapter(UsPlug usPlug) {
        super(usPlug.getRequiredFrequency(), usPlug.getRequiredPower());
        this.usPlug = usPlug;
    }



    @Override
    public Shape getPinsShape() {
        //us plugShape is flat so using a convertor to convert it to round
        return usPlug.getPinsShape() == Shape.FLAT ? pinShapeConverter : usPlug.getPinsShape();
    }

}
