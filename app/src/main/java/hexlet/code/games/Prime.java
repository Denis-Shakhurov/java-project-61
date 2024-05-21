package hexlet.code.games;

import hexlet.code.Engine;

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
        int count = 0;
        while (count < NUMBER_OF_GAMES) {
            int number = (int) (INDEX_1 + Math.random() * INDEX);
            Engine.questionAndAnswer(number);
            if ((checkNumber(number) && Engine.getAnswer().equals("yes"))
                || (!(checkNumber(number)) && Engine.getAnswer().equals("no"))) {
                System.out.println("Correct!");
                count++;
            } else if (!(checkNumber(number)) && Engine.getAnswer().equals("yes")) {
                Engine.printGameLose("no");
                break;
            } else if ((checkNumber(number)) && Engine.getAnswer().equals("no")) {
                Engine.printGameLose("yes");
                break;
            } else {
                Engine.printGameLose("");
                break;
            }
            if (count == NUMBER_OF_GAMES) {
                Engine.printGameWin();
            }
        }
    }
}
