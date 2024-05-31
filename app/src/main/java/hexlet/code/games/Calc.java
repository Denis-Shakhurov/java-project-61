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
        String ruleCalc = "What is the result of the expression?";
        Engine.engineGame(getQuestionsAndAnswers(), ruleCalc);
    }

    public static List<Map<String, String>> getQuestionsAndAnswers() {
        List<Map<String, String>> list = new ArrayList<>();
        String[] maths = {"+", "-", "*"};
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int number1 = Utils.getRandomInt(0, MAX_INT);
            int number2 = Utils.getRandomInt(0, MAX_INT);
            int index = Utils.getRandomInt(0, 2);
            String math = maths[index];
            String question = number1 + " " + math + " " + number2;
            String answer = mathOperation(number1, number2, math);
            list.add(Map.of(question, answer));
        }
        return list;
    }
    public static String mathOperation(int number1, int number2, String math) {
        String result = "";
        if (math.equals("+")) {
            result = String.valueOf(number1 + number2);
        } else if (math.equals("-")) {
            result = String.valueOf(number1 - number2);
        } else {
            result = String.valueOf(number1 * number2);
        }
        return result;
    }
}
