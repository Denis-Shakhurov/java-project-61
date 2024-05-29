package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Progression {
    private static final int NUMBER_OF_ROUNDS = 3;
    private static final int LENGTH = 10;

    public static void gameProgression() {
        Engine.engineGame(getQuestionsAndAnswers(), "Progression");
    }

    public static String[] progression() {
        int start = Utils.getRandomInt(0, 100);
        int index = Utils.getRandomInt(1, 5);
        String[] array = new String[LENGTH];
        array[0] = String.valueOf(start);
        for (int i = 1; i < array.length; i++) {
            array[i] = String.valueOf(Integer.parseInt(array[i - 1]) + index);
        }
        return array;
    }

    public static String arrayWithEllipsis(int index, String[] array) {
        array[index] = "..";
        String res = String.join(" ", array);
        return res;
    }

    public static List<Map<String, String>> getQuestionsAndAnswers() {
        List<Map<String, String>> list = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            String[] array = progression();
            int index = Utils.getRandomInt(0, LENGTH - 1);
            String result = array[index];
            String question = arrayWithEllipsis(index, array);
            String answer = result;
            list.add(Map.of(question, answer));
        }
        return list;
    }
}
