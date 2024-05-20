package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    public static void gameEven() {
        Engine engine = new Engine();
        engine.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int count = 0;
        while (count < 3) {
            int randomNumber = (int) (Math.random() * (200 + 1)) + 1;
            engine.questionAndAnswer(randomNumber);
            if ((randomNumber % 2 == 0 && engine.getAnswer().equals("yes"))
                    || (randomNumber % 2 != 0 && engine.getAnswer().equals("no"))) {
                System.out.println("Correct!");
                count++;
            } else if (engine.getAnswer().equals("yes") && randomNumber % 2 != 0) {
                engine.printGameLose("no");
                break;
            } else if (engine.getAnswer().equals("no") && randomNumber % 2 == 0) {
                engine.printGameLose("yes");
                break;
            } else {
                engine.printGameLose("");
                break;
            }
            if (count == 3) {
                engine.printGameWin();
            }
        }
    }
}
