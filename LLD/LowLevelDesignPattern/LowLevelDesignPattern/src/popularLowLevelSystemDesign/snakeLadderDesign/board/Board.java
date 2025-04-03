package popularLowLevelSystemDesign.snakeLadderDesign.board;

import popularLowLevelSystemDesign.snakeLadderDesign.ladder.Ladder;
import popularLowLevelSystemDesign.snakeLadderDesign.ladder.LadderInterface;
import popularLowLevelSystemDesign.snakeLadderDesign.ladder.LadderPositions;
import popularLowLevelSystemDesign.snakeLadderDesign.snake.Snake;
import popularLowLevelSystemDesign.snakeLadderDesign.snake.SnakePositions;

import java.util.HashMap;
import java.util.List;

public class Board {

    private static final String LADDER = "LADDER";
    private static final String SNAKE = "SNAKE";
    private static Board INSTANCE;
    private final String[] board;
    private final HashMap<Integer, Object> elementOnBoards;

    private Board() {
        this.board = new String[101];
        this.elementOnBoards = new HashMap<>();
        for(int i=0;i<101;i++) {
            this.board[i] = String.valueOf(i);
        }
        assignBoardElements();
    }

    public static Board getInstance() {
        if(INSTANCE == null ) {
            INSTANCE = new Board();
        }
        return INSTANCE;
    }

    public void assignBoardElements() {
        for(Pair ladder : LadderPositions.getLadderPositions()) {
            this.elementOnBoards.put(ladder.start, new Ladder(ladder.start, ladder.end));
            board[ladder.start] = LADDER;
        }

        for(Pair snake : SnakePositions.getSnakePositions()) {
            this.elementOnBoards.put(snake.start, new Snake(snake.start, snake.end));
            board[snake.start] = SNAKE;
        }
    }

    public int estimateNextPosition(int currentPosition, int move) {
        int nextPosition = currentPosition + move;
        if(nextPosition > 100) {
            return currentPosition;
        }

        if(elementOnBoards.containsKey(nextPosition)) {
            if(board[nextPosition].equals(LADDER)) {
                System.out.println("Ladder used !");
                Ladder ladder = (Ladder) elementOnBoards.get(nextPosition);
                nextPosition = ladder.useLadder(nextPosition);
            } else {
                System.out.println("Snake used !");
                Snake snake = (Snake) elementOnBoards.get(nextPosition);
                nextPosition = snake.bitePlayer(nextPosition);
            }
        }
        return nextPosition;
    }

}