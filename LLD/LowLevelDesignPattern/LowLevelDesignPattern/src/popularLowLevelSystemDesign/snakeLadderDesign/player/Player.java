package popularLowLevelSystemDesign.snakeLadderDesign.player;

import popularLowLevelSystemDesign.snakeLadderDesign.dice.Dice;

public class Player implements PlayerInterface{

    private int currentPosition;
    private Dice dice;

    public Player(Dice dice) {
        this.currentPosition = 0;
        this.dice = dice;
    }

    @Override
    public void rollDice() {
        //role the dice

    }

    @Override
    public void makeAMove() {
        //calculate all possibilities
        //choose the correct options (greedy approach)
    }

    @Override
    public int currentPosition() {
        return this.currentPosition;
    }
}
