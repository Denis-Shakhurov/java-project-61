package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Even {
    private static final int NUMBER_OF_ROUNDS = 3;
    private static final int MAX_INT = 200;

    public static void gameEven() {
        String ruleEven = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        Engine.engineGame(getQuestionsAndAnswers(), ruleEven);
    }

    public static List<Map<String, String>> getQuestionsAndAnswers() {
        List<Map<String, String>> questionsAndAnswers = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int number = Utils.getRandomInt(1, MAX_INT);
            if (isEven(number)) {
                questionsAndAnswers.add(Map.of(String.valueOf(number), "yes"));
            } else {
                questionsAndAnswers.add(Map.of(String.valueOf(number), "no"));
            }
        }
        return questionsAndAnswers;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
