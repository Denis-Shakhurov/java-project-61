package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Progression {
    private static final int NUMBER_OF_ROUNDS = 3;
    private static final int LENGTH = 10;
    private static final int MAX_INT = 100;
    private static final int MAX_INDEX = 5;

    public static void gameProgression() {
        String ruleProgression = "What number is missing in the progression?";
        Engine.engineGame(getQuestionsAndAnswers(), ruleProgression);
    }

    public static String[] getProgression(int start, int index) {
        String[] progression = new String[LENGTH];
        progression[0] = String.valueOf(start);
        for (int i = 1; i < progression.length; i++) {
            progression[i] = String.valueOf(Integer.parseInt(progression[i - 1]) + index);
        }
        return progression;
    }

    public static String getProgressionWithEllipsis(int indexEllipsis, String[] progression) {
        progression[indexEllipsis] = "..";
        String progressionWithEllipsis = String.join(" ", progression);
        return progressionWithEllipsis;
    }

    public static List<Map<String, String>> getQuestionsAndAnswers() {
        List<Map<String, String>> questionsAndAnswers = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_ROUNDS; i++) {
            int start = Utils.getRandomInt(0, MAX_INT);
            int index = Utils.getRandomInt(1, MAX_INDEX);
            String[] array = getProgression(start, index);
            int indexEllipsis = Utils.getRandomInt(0, LENGTH - 1);
            String result = array[indexEllipsis];
            String question = getProgressionWithEllipsis(indexEllipsis, array);
            String answer = result;
            questionsAndAnswers.add(Map.of(question, answer));
        }
        return questionsAndAnswers;
    }
}
