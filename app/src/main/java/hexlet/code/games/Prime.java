package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

public class Prime {
    private static final int INDEX = 100;
    public static void gamePrime() {
        Engine.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int count = 0;
        while (count < App.ROUND_OF_GAME) {
            int number = (int) (Math.random() * INDEX);
            Engine.questionAndAnswer(number);
            String answer = Engine.getAnswer();
            if (Engine.enginePrime(number, answer)) {
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
