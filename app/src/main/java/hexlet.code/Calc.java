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
                    int resultWork = number1 * number2;
                    if (Integer.parseInt(engine.getAnswer()) == resultWork) {
                        System.out.println("Correct!");
                        count++;
                    } else {
                        engine.printGameLose(resultWork);
                        return;
                    }
                    break;
                case 1: engine.questionAndAnswer("+", number1, number2);
                    int resultSum = number1 + number2;
                    if (Integer.parseInt(engine.getAnswer()) == resultSum) {
                        System.out.println("Correct!");
                        count++;
                    } else {
                        engine.printGameLose(resultSum);
                        return;
                    }
                    break;
                case 2: engine.questionAndAnswer("-", number1, number2);
                    int resultSub = number1 - number2;
                    if (Integer.parseInt(engine.getAnswer()) == resultSub) {
                        System.out.println("Correct!");
                        count++;
                    } else {
                        engine.printGameLose(resultSub);
                        return;
                    }
                    break;
                default :
                    System.out.println("Incorrect index");
            }
            if (count == 3) {
                engine.printGameWin();
            }
        }
    }
}
