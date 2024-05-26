package hexlet.code.games;

import hexlet.code.Engine;
import java.util.HashMap;
import java.util.Map;

public class Prime {
    private static final int NUMBER_OF_GAMES = 3;
    private static final int INDEX = 100;
    private static final int INDEX_1 = 3;
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
        Engine.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        Engine.engineGame(getQuestionsAndAnswers());
    }
    public static Map<String, String> getQuestionsAndAnswers() {
        Map<String, String> maps = new HashMap<>();
        for (int i = 0; i < NUMBER_OF_GAMES; i++) {
            int number = (int) (INDEX_1 + Math.random() * INDEX);
            if (checkNumber(number)) {
                maps.put(String.valueOf(number), "yes");
            } else {
                maps.put(String.valueOf(number), "no");
            }
        }
        return maps;
    }
}
