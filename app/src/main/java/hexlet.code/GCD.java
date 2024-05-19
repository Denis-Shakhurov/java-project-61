package hexlet.code;


public class GCD {
    public static int gcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : gcd(b, a % b);
    }
    public static void gameGsd() {
        Engine engine = new Engine();
        engine.greeting();
        System.out.println("Find the greatest common divisor of given numbers.");
        int count = 0;
        while (count < 3) {
            int number1 = (int) (Math.random() * (100 + 1)) + 1;
            int number2 = (int) (Math.random() * (100 + 1)) + 1;
            int result = gcd(number1, number2);
            engine.questionAndAnswer(number1, number2);
            if (Integer.parseInt(engine.getAnswer()) == result) {
                System.out.println("Correct!");
                count++;
            } else {
                engine.printGameLose(result);
                break;
            }
            if (count == 3) {
                engine.printGameWin();
            }
        }
    }
}