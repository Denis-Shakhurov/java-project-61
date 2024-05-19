package hexlet.code;

public class Prime {
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
        Engine engine = new Engine();
        engine.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int count = 0;
        while (count < 3) {
            int number = (int) (3 + Math.random() * 100);
            engine.questionAndAnswer(number);
            if ((checkNumber(number) && engine.getAnswer().equals("yes"))
                || (!(checkNumber(number)) && engine.getAnswer().equals("no"))) {
                System.out.println("Correct!");
                count++;
            } else if (!(checkNumber(number)) && engine.getAnswer().equals("yes")) {
                engine.printGameLose("no");
                break;
            } else if ((checkNumber(number)) && engine.getAnswer().equals("no")) {
                engine.printGameLose("yes");
                break;
            } else if (engine.getAnswer() == null || engine.getAnswer().matches("\s+")
                    || engine.getAnswer().matches("[-+]?\\d+")) {
                engine.printGameLose("");
                break;
            }
            if (count == 3) {
                engine.printGameWin();
            }
        }
    }
}
