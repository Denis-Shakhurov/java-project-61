package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private static final int NUMBER_OF_GAMES = 3;
    private static final int LENGTH = 10;
    private static final int INDEX_START = 100;
    private static final int INDEX = 5;

    public static int[] arrayInt() {
        //int length = (int) (5 + Math.random() * 5);
        int start = (int) (Math.random() * INDEX_START);
        int index = (int) (1 + Math.random() * INDEX);
        int[] array = new int[LENGTH];
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
        while (count < NUMBER_OF_GAMES) {
            int[] array = arrayInt();
            int index = (int) (1 + Math.random() * (array.length - 1));
            int result = array[index];
            String printArray = arrayWithEllipsis(index, array);
            Engine.questionAndAnswer(printArray);
            if (Engine.getAnswer().matches("^[\\p{L} ?!,.']+$")
                    || Engine.getAnswer().matches("\s+")
                    || Engine.getAnswer().equals("")) {
                Engine.printGameLose(result);
                break;
            } else if (Integer.parseInt(Engine.getAnswer()) != result) {
                Engine.printGameLose(result);
                break;
            } else if (Integer.parseInt(Engine.getAnswer()) == result) {
                System.out.println("Correct!");
                count++;
            }
            if (count == NUMBER_OF_GAMES) {
                Engine.printGameWin();
            }
        }
    }
}
