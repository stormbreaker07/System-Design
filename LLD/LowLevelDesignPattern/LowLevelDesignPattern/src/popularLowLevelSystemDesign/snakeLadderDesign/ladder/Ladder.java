package popularLowLevelSystemDesign.snakeLadderDesign.ladder;

public class Ladder implements LadderInterface{

    private final int startingPoint;
    private final int endingPoint;

    public Ladder(int startingPoint, int endingPoint) {
        this.startingPoint = startingPoint;
        this.endingPoint = endingPoint;
    }

        @Override
    public int useLadder(int currPosition) {
        return currPosition == startingPoint ? endingPoint : currPosition;
    }


}
