package popularLowLevelSystemDesign.snakeLadderDesign;

import popularLowLevelSystemDesign.snakeLadderDesign.board.Board;
import popularLowLevelSystemDesign.snakeLadderDesign.player.Player;
import popularLowLevelSystemDesign.snakeLadderDesign.player.PlayerInterface;

import java.util.ArrayList;
import java.util.List;

public class PlaySnakeLadderGame {

    private List<PlayerInterface> players;

    public PlaySnakeLadderGame() {
        Board board = Board.getInstance();
    }

    public void initializeGame(int numberOfPlayers, String[] playerNames) {
        this.players = new ArrayList<>();
        for(int i=0;i<numberOfPlayers;i++) {
            players.add(new Player(playerNames[i]));
        }
    }

    public void startGame() throws InterruptedException {
        System.out.println("lets start the game");
        boolean flag = true;
        while(flag) {
            for(PlayerInterface player : players) {
                player.rollDice();
                player.makeAMove();
                if(player.currentPosition() == 100) {
                    System.out.println(player.getPlayerName() + " WINS....!");
                    flag = false;
                }
                Thread.sleep(500);
            }
        }
    }
}
