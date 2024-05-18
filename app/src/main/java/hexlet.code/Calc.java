package hexlet.code;

public class Calc {
    public static void gameCalc() {
        Engine engine = new Engine();
        engine.greeting();
        System.out.println("What is the result of the expression?");
        int count = 0;
        while (count < 3) {
            int number1 = (int) ((Math.random() * 10 + 1) + 1);
            int number2 = (int) ((Math.random() * 10 + 1) + 1);
            int index = (int) (Math.random() * 3);
            switch (index) {
                case 0: engine.questionAndAnswer("*", number1, number2);
                    if (Integer.parseInt(engine.getAnswer()) == number1 * number2) {
                        System.out.println("Correct!");
                        count++;
                    } else {
                        System.out.println("'" + engine.getAnswer() + "' is wrong answer ;(. Correct answer was '"
                            + (number2 * number1) + "'.\n" + "Let's try again, " + engine.getName());
                        return;
                    }
                    break;
                case 1: engine.questionAndAnswer("+", number1, number2);
                    if (Integer.parseInt(engine.getAnswer()) == number1 + number2) {
                        System.out.println("Correct!");
                        count++;
                    } else {
                        System.out.println("'" + engine.getAnswer() + "' is wrong answer ;(. Correct answer was '"
                            + (number2 + number1) + "'.\n" + "Let's try again, " + engine.getName());
                        return;
                    }
                    break;
                case 2: engine.questionAndAnswer("-", number1, number2);
                    if (Integer.parseInt(engine.getAnswer()) == number1 - number2) {
                        System.out.println("Correct!");
                        count++;
                    } else {
                        System.out.println("'" + engine.getAnswer() + "' is wrong answer ;(. Correct answer was '"
                            + (number2 - number1) + "'.\n" + "Let's try again, " + engine.getName());
                        return;
                    }
                    break;
                default :
                    System.out.println("Incorrect index");
            }
            if (count == 3) {
                System.out.println("Congratulations, " + engine.getName());
            }
        }
    }
}
