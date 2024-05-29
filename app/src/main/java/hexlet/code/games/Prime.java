package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Prime {
    private static final int NUMBER_OF_ROUNDS = 3;
    private static final int MAX_INT = 100;

    public static boolean checkNumber(int number) {
        boolean check = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                check = false;
                break;
            }
        }
        return check;
    }

    public static void gamePrime() {
        Engine.engineGame(getQuestionsAndAnswers(), "Prime");
    }

    public static List<Map<String, String>> getQuestionsAndAnswers() {
        List<Map<String, String>> list = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int number = Utils.getRandomInt(1, MAX_INT);
            if (checkNumber(number)) {
                list.add(Map.of(String.valueOf(number), "yes"));
            } else {
                list.add(Map.of(String.valueOf(number), "no"));
            }
        }
        return list;
    }
}
