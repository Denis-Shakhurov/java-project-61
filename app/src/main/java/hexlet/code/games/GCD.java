package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class GCD {
    private static final int NUMBER_OF_ROUNDS = 3;

    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }

    public static void gameGsd() {
        Engine.engineGame(getQuestionsAndAnswers(), "GSD");
    }

    public static List<Map<String, String>> getQuestionsAndAnswers() {
        List<Map<String, String>> list = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int number1 = Utils.getRandomInt(0, 100);
            int number2 = Utils.getRandomInt(0, 100);
            int result = gcd(number1, number2);
            String question = number1 + " " + number2;
            String answer = String.valueOf(result);
            list.add(Map.of(question, answer));
        }
        return list;
    }
}
