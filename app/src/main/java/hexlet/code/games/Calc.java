package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private static final int NUMBER_OF_GAMES = 3;
    private static final int INDEX = 10;
    public static void gameCalc() {

        Engine.greeting();
        System.out.println("What is the result of the expression?");
        int count = 0;
        while (count < NUMBER_OF_GAMES) {
            int number1 = (int) ((Math.random() * INDEX + 1) + 1);
            int number2 = (int) ((Math.random() * INDEX + 1) + 1);
            int index = (int) (Math.random() * 3);
            switch (index) {
                case 0: Engine.questionAndAnswer("*", number1, number2);
                    int resultWork = number1 * number2;
                    if (!Engine.getAnswer().matches("\\d+")
                            || Engine.getAnswer().matches("\\s+")
                            || Engine.getAnswer().equals("")
                            || Integer.parseInt(Engine.getAnswer()) != resultWork) {
                        Engine.printGameLose(resultWork);
                        return;
                    } else if (Integer.parseInt(Engine.getAnswer()) == resultWork) {
                        System.out.println("Correct!");
                        count++;
                    }
                    break;
                case 1: Engine.questionAndAnswer("+", number1, number2);
                    int resultSum = number1 + number2;
                    if (!Engine.getAnswer().matches("\\d+")
                            || Engine.getAnswer().matches("\\s+")
                            || Engine.getAnswer().equals("")
                            || Integer.parseInt(Engine.getAnswer()) != resultSum) {
                        Engine.printGameLose(resultSum);
                        return;
                    } else if (Integer.parseInt(Engine.getAnswer()) == resultSum) {
                        System.out.println("Correct!");
                        count++;
                    }
                    break;
                case 2: Engine.questionAndAnswer("-", number1, number2);
                    int resultSub = number1 - number2;
                    if (Engine.getAnswer().matches("^[\\p{L} ?!,.']+$")
                            || Engine.getAnswer().matches("\\s+")
                            || Engine.getAnswer().equals("")
                            || Integer.parseInt(Engine.getAnswer()) != resultSub) {
                        Engine.printGameLose(resultSub);
                        return;
                    } else if (Integer.parseInt(Engine.getAnswer()) == resultSub) {
                        System.out.println("Correct!");
                        count++;
                    }
                    break;
                default :
                    System.out.println("Incorrect index");
            }
            if (count == NUMBER_OF_GAMES) {
                Engine.printGameWin();
            }
        }
    }
}
