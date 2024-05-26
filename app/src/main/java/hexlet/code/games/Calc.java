package hexlet.code.games;

import hexlet.code.Engine;
import java.util.HashMap;
import java.util.Map;

public class Calc {
    private static final int NUMBER_OF_GAMES = 3;
    private static final int INDEX_NUMBER = 10;
    private static final int INDEX = 3;
    public static void gameCalc() {

        Engine.greeting();
        System.out.println("What is the result of the expression?");
        Engine.engineGame(getQuestionsAndAnswers());
    }
    public static Map<String, String> getQuestionsAndAnswers() {
        Map<String, String> maps = new HashMap<>();
        for (int i = 0; i < NUMBER_OF_GAMES; i++) {
            int number1 = (int) ((Math.random() * INDEX_NUMBER + 1) + 1);
            int number2 = (int) ((Math.random() * INDEX_NUMBER + 1) + 1);
            int index = (int) (Math.random() * INDEX);
            if (index == 0) {
                int resultWork = number1 * number2;
                String questionWork = number1 + " * " + number2;
                String answerWork = String.valueOf(resultWork);
                maps.put(questionWork, answerWork);
            }
            if (index == 1) {
                int resultSum = number1 + number2;
                String questionSum = number1 + " + " + number2;
                String answerSum = String.valueOf(resultSum);
                maps.put(questionSum, answerSum);
            }
            if (index == 2) {
                int resultSub = number1 - number2;
                String questionSub = number1 + " - " + number2;
                String answerSub = String.valueOf(resultSub);
                maps.put(questionSub, answerSub);
            }
        }
        return maps;
    }
}
