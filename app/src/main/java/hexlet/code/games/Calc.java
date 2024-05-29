package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Calc {
    private static final int NUMBER_OF_ROUNDS = 3;
    private static final int MAX_INT = 10;

    public static void gameCalc() {
        Engine.engineGame(getQuestionsAndAnswers(), "Calc");
    }

    public static List<Map<String, String>> getQuestionsAndAnswers() {
        List<Map<String, String>> list = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int number1 = Utils.getRandomInt(0, MAX_INT);
            int number2 = Utils.getRandomInt(0, MAX_INT);
            int index = Utils.getRandomInt(0, 2);
            if (index == 0) {
                int resultWork = number1 * number2;
                String questionWork = number1 + " * " + number2;
                String answerWork = String.valueOf(resultWork);
                list.add(Map.of(questionWork, answerWork));
            }
            if (index == 1) {
                int resultSum = number1 + number2;
                String questionSum = number1 + " + " + number2;
                String answerSum = String.valueOf(resultSum);
                list.add(Map.of(questionSum, answerSum));
            }
            if (index == 2) {
                int resultSub = number1 - number2;
                String questionSub = number1 + " - " + number2;
                String answerSub = String.valueOf(resultSub);
                list.add(Map.of(questionSub, answerSub));
            }
        }
        return list;
    }
}
