package hexlet.code.games;

import hexlet.code.Engine;
import java.util.HashMap;
import java.util.Map;

public class GCD {
    private static final int NUMBER_OF_GAMES = 3;
    private static final int INDEX = 100;
    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
    public static void gameGsd() {
        Engine.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        Engine.engineGame(getQuestionsAndAnswers());
    }
    public static Map<String, String> getQuestionsAndAnswers() {
        Map<String, String> maps = new HashMap<>();
        for (int i = 0; i < NUMBER_OF_GAMES; i++) {
            int number1 = (int) (Math.random() * (INDEX + 1)) + 1;
            int number2 = (int) (Math.random() * (INDEX + 1)) + 1;
            int result = gcd(number1, number2);
            String question = number1 + " " + number2;
            String answer = String.valueOf(result);
            maps.put(question, answer);
        }
        return maps;
    }
}
