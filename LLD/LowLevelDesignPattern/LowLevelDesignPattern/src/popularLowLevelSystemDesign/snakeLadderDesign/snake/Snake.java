package popularLowLevelSystemDesign.snakeLadderDesign.snake;

public class Snake implements SnakeInterface{

    private final int startingPoint;
    private final int endingPoint;

    public Snake(int startingPoint, int endingPoint) {
        this.startingPoint = startingPoint;
        this.endingPoint = endingPoint;
    }

    @Override
    public int getStartingPoint() {
        return startingPoint;
    }

    @Override
    public int getEndingPoint() {
        return endingPoint;
    }

    @Override
    public int bitePlayer(int currPosition) {
        return currPosition == startingPoint ? endingPoint : currPosition;
    }
}
