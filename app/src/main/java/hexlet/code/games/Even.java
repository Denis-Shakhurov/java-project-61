package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final int NUMBER_OF_GAMES = 3;
    private static final int INDEX = 200;
    public static void gameEven() {
        Engine.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int count = 0;
        while (count < NUMBER_OF_GAMES) {
            int randomNumber = (int) (1 + Math.random() * INDEX);
            Engine.questionAndAnswer(randomNumber);
            if ((randomNumber % 2 == 0 && Engine.getAnswer().equals("yes"))
                    || (randomNumber % 2 != 0 && Engine.getAnswer().equals("no"))) {
                System.out.println("Correct!");
                count++;
            } else if (Engine.getAnswer().equals("yes") && randomNumber % 2 != 0) {
                Engine.printGameLose("no");
                break;
            } else if (Engine.getAnswer().equals("no") && randomNumber % 2 == 0) {
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
