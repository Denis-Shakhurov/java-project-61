package hexlet.code.games;


import hexlet.code.App;
import hexlet.code.Engine;

public class GCD {
    private static final int INDEX = 100;
    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
    public static void gameGsd() {
        Engine.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        int count = 0;
        while (count < App.ROUND_OF_GAME) {
            int number1 = (int) (Math.random() * (INDEX + 1)) + 1;
            int number2 = (int) (Math.random() * (INDEX + 1)) + 1;
            Engine.questionAndAnswer(number1, number2);
            String answer = Engine.getAnswer();
            if (Engine.engineGcd(number1, number2, answer)) {
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
