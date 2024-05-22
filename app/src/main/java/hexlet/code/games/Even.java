package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

public class Even {
    private static final int INDEX = 200;
    public static void gameEven() {
        Engine.greeting();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int count = 0;
        while (count < App.ROUND_OF_GAME) {
            int randomNumber = (int) (1 + Math.random() * INDEX);
            Engine.questionAndAnswer(randomNumber);
            String answer = Engine.getAnswer();
            if (Engine.engineEven(randomNumber, answer)) {
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
