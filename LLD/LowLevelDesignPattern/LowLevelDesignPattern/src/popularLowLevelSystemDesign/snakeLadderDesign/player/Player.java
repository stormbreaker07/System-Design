package popularLowLevelSystemDesign.snakeLadderDesign.player;

import popularLowLevelSystemDesign.snakeLadderDesign.board.Board;
import popularLowLevelSystemDesign.snakeLadderDesign.dice.Dice;

import java.util.List;

public class Player implements PlayerInterface{

    private final String playerName;
    private int currentPosition;
    private List<Integer> diceValues;
    private final Board board;

    public Player(String playerName) {
        this.playerName = playerName;
        this.currentPosition = 0;
        board = Board.getInstance();
    }

    @Override
    public void rollDice() {
        //role the dice
        diceValues = Dice.rollDice();
        System.out.println(playerName + " make move :");
        diceValues.forEach((value) -> {
            System.out.print(value + ", ");
        });
        // the next move can be updated to find the best way to move if you get 6,1 or 6,6,2
        //what i mean is in which way you can move to longest distance.
        //for now we just move in the given order of dice number we got
    }

    @Override
    public void makeAMove() {
        diceValues.forEach((diceValue) -> {
            currentPosition = board.estimateNextPosition(currentPosition, diceValue);
        });
        System.out.println(playerName + "is standing on" + currentPosition);
    }

    @Override
    public int currentPosition() {
        return this.currentPosition;
    }

    public String getPlayerName() {
        return playerName;
    }
}
