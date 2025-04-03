package popularLowLevelSystemDesign.snakeLadderDesign.snake;

import popularLowLevelSystemDesign.snakeLadderDesign.board.Pair;

import java.util.ArrayList;
import java.util.List;

public class SnakePositions {

    private static List<Pair> snakePositions;

    public static List<Pair> getSnakePositions() {
        snakePositions = new ArrayList<>();
        snakePositions.add(new Pair(17,7));
        snakePositions.add(new Pair(54,34));
        snakePositions.add(new Pair(62,19));
        snakePositions.add(new Pair(64,60));
        snakePositions.add(new Pair(87,36));
        snakePositions.add(new Pair(92,73));
        snakePositions.add(new Pair(95,75));
        snakePositions.add(new Pair(98,79));
        return snakePositions;
    }
}
