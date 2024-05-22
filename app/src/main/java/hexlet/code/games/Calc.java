package hexlet.code.games;

import hexlet.code.App;
import hexlet.code.Engine;

public class Calc {
    private static final int INDEX_NUMBER = 10;
    private static final int INDEX_MATH_OPERATION = 3;
    public static void gameCalc() {

        Engine.greeting();
        System.out.println("What is the result of the expression?");
        int count = 0;
        while (count < App.ROUND_OF_GAME) {
            int number1 = (int) (Math.random() * INDEX_NUMBER);
            int number2 = (int) (Math.random() * INDEX_NUMBER);
            int index = (int) (Math.random() * INDEX_MATH_OPERATION);
            if (Engine.engineCalc(number1, number2, index)) {
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
