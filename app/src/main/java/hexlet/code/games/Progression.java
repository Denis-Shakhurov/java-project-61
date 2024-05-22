package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

public class Progression {
    private static final int LENGTH_PROGRESSION = 10;
    private static final int NUMBER_START_PROGRESSION = 100;
    private static final int INCREASE = 5;

    public static int[] arrayInt() {
        //int length = (int) (5 + Math.random() * 5);
        int start = (int) (Math.random() * NUMBER_START_PROGRESSION);
        int index = (int) (1 + Math.random() * INCREASE);
        int[] array = new int[LENGTH_PROGRESSION];
        array[0] = start;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + index;
        }
        return array;
    }
    public static String arrayWithEllipsis(int index, int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                sb.append("..");
                sb.append(" ");
            } else {
                sb.append(array[i]);
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
    public static void gameProgression() {
        Engine.greeting();
        System.out.println("What number is missing in the progression?");
        int count = 0;
        while (count < App.ROUND_OF_GAME) {
            int[] array = arrayInt();
            int index = (int) (1 + Math.random() * (array.length - 1));
            int question = array[index];
            String printArray = arrayWithEllipsis(index, array);
            Engine.questionAndAnswer(printArray);
            String answer = Engine.getAnswer();
            if (Engine.engineProgression(question, answer)) {
                count++;
            } else {
                break;
            }
            if (count == App.ROUND_OF_GAME) {
                Engine.printGameWin();
            }
        }
    }
}
