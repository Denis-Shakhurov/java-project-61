package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    public static int[] arrayInt() {
        //int length = (int) (5 + Math.random() * 5);
        int start = (int) (Math.random() * 100);
        int index = (int) (1 + Math.random() * 5);
        int[] array = new int[10];
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
        Engine engine = new Engine();
        engine.greeting();
        System.out.println("What number is missing in the progression?");
        int count = 0;
        while (count < 3) {
            int[] array = arrayInt();
            int index = (int) (1 + Math.random() * (array.length - 1));
            int result = array[index];
            String printArray = arrayWithEllipsis(index, array);
            engine.questionAndAnswer(printArray);
            if (engine.getAnswer().matches("^[\\p{L}\\d ?!,.']+$")
                    || engine.getAnswer().matches("\s+")
                    || engine.getAnswer().equals("")) {
                engine.printGameLose(result);
                break;
            } else if (Integer.parseInt(engine.getAnswer()) != result) {
                engine.printGameLose(result);
                break;
            } else if (Integer.parseInt(engine.getAnswer()) == result) {
                System.out.println("Correct!");
                count++;
            }
            if (count == 3) {
                engine.printGameWin();
            }
        }
    }
}
