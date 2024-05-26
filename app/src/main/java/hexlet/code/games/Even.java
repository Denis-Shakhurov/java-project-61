package hexlet.code.games;

import hexlet.code.Engine;
import java.util.HashMap;
import java.util.Map;

public class Even {
    private static final int NUMBER_OF_GAMES = 3;
    private static final int INDEX = 200;

    public static void gameEven() {
        Engine.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        Engine.engineGame(getQuestionsAndAnswers());
    }
    public static Map<String, String> getQuestionsAndAnswers() {
        Map<String, String> maps = new HashMap<>();
        for (int i = 0; i < NUMBER_OF_GAMES; i++) {
            int number = (int) (1 + Math.random() * INDEX);
            if (isEven(number)) {
                maps.put(String.valueOf(number), "yes");
            } else {
                maps.put(String.valueOf(number), "no");
            }
        }
        return maps;
    }
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
