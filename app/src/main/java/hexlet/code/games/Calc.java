package hexlet.code.games;

import hexlet.code.Engine;

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
                    if (!engine.getAnswer().matches("\\d+")
                            || engine.getAnswer().matches("\\s+")
                            || engine.getAnswer().equals("")
                            || Integer.parseInt(engine.getAnswer()) != resultWork) {
                        engine.printGameLose(resultWork);
                        return;
                    } else if (Integer.parseInt(engine.getAnswer()) == resultWork) {
                        System.out.println("Correct!");
                        count++;
                    }
                    break;
                case 1: engine.questionAndAnswer("+", number1, number2);
                    int resultSum = number1 + number2;
                    if (!engine.getAnswer().matches("\\d+")
                            || engine.getAnswer().matches("\\s+")
                            || engine.getAnswer().equals("")
                            || Integer.parseInt(engine.getAnswer()) != resultSum) {
                        engine.printGameLose(resultSum);
                        return;
                    } else if (Integer.parseInt(engine.getAnswer()) == resultSum) {
                        System.out.println("Correct!");
                        count++;
                    }
                    break;
                case 2: engine.questionAndAnswer("-", number1, number2);
                    int resultSub = number1 - number2;
                    if (!engine.getAnswer().matches("\\d+")
                            || engine.getAnswer().matches("\\s+")
                            || engine.getAnswer().equals("")
                            || Integer.parseInt(engine.getAnswer()) != resultSub) {
                        engine.printGameLose(resultSub);
                        return;
                    } else if (Integer.parseInt(engine.getAnswer()) == resultSub) {
                        System.out.println("Correct!");
                        count++;
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
