package popularLowLevelSystemDesign.snakeLadderDesign.dice;

import java.util.*;

public class Dice {

    public static List<Integer> rollDice() {
        List<Integer> diceValue = new ArrayList<>();
        int curr = 0;
        int count = 0;
        //roll dice for once
        Random random = new Random();
        curr = random.nextInt(7);
        diceValue.add(curr);
        count++;
        while(curr == 6) {
            curr = random.nextInt(7);
            diceValue.add(curr);
            if(curr == 6) count++;

            if(count == 3) {
                diceValue.clear();
                break;
            }
        }
        diceValue.sort(Comparator.reverseOrder());
        return diceValue;
    }
}
