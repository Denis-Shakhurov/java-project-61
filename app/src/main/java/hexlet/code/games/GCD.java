package hexlet.code.games;


import hexlet.code.Engine;

public class GCD {
    private static final int NUMBER_OF_GAMES = 3;
    private static final int INDEX = 100;
    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
    public static void gameGsd() {
        Engine.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        int count = 0;
        while (count < NUMBER_OF_GAMES) {
            int number1 = (int) (Math.random() * (INDEX + 1)) + 1;
            int number2 = (int) (Math.random() * (INDEX + 1)) + 1;
            int result = gcd(number1, number2);
            Engine.questionAndAnswer(number1, number2);
            if (Engine.getAnswer().matches("^[\\p{L} ?!,.']+$")
                    || Engine.getAnswer().matches("\\s+")
                    || Engine.getAnswer().equals("")
                    || Integer.parseInt(Engine.getAnswer()) != result) {
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
