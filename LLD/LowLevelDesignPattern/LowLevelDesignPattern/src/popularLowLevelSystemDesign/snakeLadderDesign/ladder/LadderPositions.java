package popularLowLevelSystemDesign.snakeLadderDesign.ladder;

import popularLowLevelSystemDesign.snakeLadderDesign.board.Pair;

import java.util.ArrayList;
import java.util.List;

public class LadderPositions {

    private static List<Pair> ladderPositions;

    public static List<Pair> getLadderPositions() {
        ladderPositions = new ArrayList<>();
        ladderPositions.add(new Pair(1,38));
        ladderPositions.add(new Pair(4,14));
        ladderPositions.add(new Pair(9,31));
        ladderPositions.add(new Pair(28,84));
        ladderPositions.add(new Pair(21,42));
        ladderPositions.add(new Pair(51,67));
        ladderPositions.add(new Pair(72,91));
        ladderPositions.add(new Pair(80,99));
        return ladderPositions;
    }
 }
