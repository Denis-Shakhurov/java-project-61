package hexlet.code;

import hexlet.code.games.GCD;

import java.util.Scanner;

public class Engine {
    private static Scanner sc = new Scanner(System.in);
    private static String answer = "";
    private static String name = "";

    public static String getAnswer() {
        return answer;
    }

    public static String getName() {
        return name;
    }
    public static void questionAndAnswer(int number) {
        System.out.println("Question: " + number);
        System.out.print("Your answer: ");
        answer = sc.nextLine();
    }
    public static void questionAndAnswer(String text) {
        System.out.println("Question: " + text);
        System.out.print("Your answer: ");
        answer = sc.nextLine();
    }
    public static void questionAndAnswer(int number1, int number2) {
        System.out.println("Question: " + number1 + " " + number2);
        System.out.print("Your answer: ");
        answer = sc.nextLine();
    }
    public static void questionAndAnswer(String math, int number1, int number2) {
        System.out.println("Question: " + number1 + " " + math + " " + number2);
        System.out.print("Your answer: ");
        answer = sc.nextLine();
    }
    public static void greeting() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = sc.nextLine();
        System.out.println("Hello, " + getName() + "!");
    }
    public static void printGameWin() {
        System.out.println("Congratulations, " + getName() + "!");
    }
    public static void printGameLose(String text) {
        System.out.println("'" + getAnswer() + "' is wrong answer ;(. Correct answer was '"
                + text + "'.\n" + "Let's try again, " + getName() + "!");
    }
    public static void printGameLose(int result) {
        System.out.println("'" + getAnswer() + "' is wrong answer ;(. Correct answer was '"
                + result + "'.\n" + "Let's try again, " + getName() + "!");
    }
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
    public static boolean engineEven(int question, String answerText) {
        boolean result = false;
        if ((isEven(question) && answerText.equals("yes"))
                || (!isEven(question) && answerText.equals("no"))) {
            System.out.println("Correct!");
            result = true;
        } else if (answerText.equals("yes") && !isEven(question)) {
            Engine.printGameLose("no");
            return result;
        } else if (answerText.equals("no") && isEven(question)) {
            Engine.printGameLose("yes");
            return result;
        } else {
            Engine.printGameLose("");
            return result;
        }
        return result;
    }
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
    public static boolean enginePrime(int question, String answerText) {
        boolean result = false;
        if ((checkNumber(question) && answerText.equals("yes"))
                || (!(checkNumber(question)) && answerText.equals("no"))) {
            System.out.println("Correct!");
            result = true;
        } else if (!(checkNumber(question)) && answerText.equals("yes")) {
            Engine.printGameLose("no");
            return result;
        } else if ((checkNumber(question)) && answerText.equals("no")) {
            Engine.printGameLose("yes");
            return result;
        } else {
            Engine.printGameLose("");
            return result;
        }
        return result;
    } public static boolean engineCalc(int number1, int number2, int index) {
        boolean result = false;
        switch (index) {
            case 0: Engine.questionAndAnswer("*", number1, number2);
                int resultWork = number1 * number2;
                if (!Engine.getAnswer().matches("\\d+")
                        || Engine.getAnswer().matches("\\s+")
                        || Engine.getAnswer().equals("")
                        || Integer.parseInt(Engine.getAnswer()) != resultWork) {
                    Engine.printGameLose(resultWork);
                    return result;
                } else if (Integer.parseInt(Engine.getAnswer()) == resultWork) {
                    System.out.println("Correct!");
                    result = true;
                }
                break;
            case 1: Engine.questionAndAnswer("+", number1, number2);
                int resultSum = number1 + number2;
                if (!Engine.getAnswer().matches("\\d+")
                        || Engine.getAnswer().matches("\\s+")
                        || Engine.getAnswer().equals("")
                        || Integer.parseInt(Engine.getAnswer()) != resultSum) {
                    Engine.printGameLose(resultSum);
                    return result;
                } else if (Integer.parseInt(Engine.getAnswer()) == resultSum) {
                    System.out.println("Correct!");
                    result = true;
                }
                break;
            case 2: Engine.questionAndAnswer("-", number1, number2);
                int resultSub = number1 - number2;
                if (Engine.getAnswer().matches("^[\\p{L} ?!,.']+$")
                        || Engine.getAnswer().matches("\\s+")
                        || Engine.getAnswer().equals("")
                        || Integer.parseInt(Engine.getAnswer()) != resultSub) {
                    Engine.printGameLose(resultSub);
                    return result;
                } else if (Integer.parseInt(Engine.getAnswer()) == resultSub) {
                    System.out.println("Correct!");
                    result = true;
                }
                break;
            default :
                System.out.println("Incorrect index");
        }
        return result;
    }
    public static boolean engineGcd(int number1, int number2, String answerText) {
        boolean result = false;
        if (Engine.getAnswer().matches("^[\\p{L} ?!,.']+$")
                || Engine.getAnswer().matches("\\s+")
                || Engine.getAnswer().equals("")
                || Integer.parseInt(answerText) != GCD.gcd(number1, number2)) {
            Engine.printGameLose(GCD.gcd(number1, number2));
            return result;
        } else if (Integer.parseInt(answerText) == GCD.gcd(number1, number2)) {
            System.out.println("Correct!");
            result = true;
        }
        return result;
    }
    public static boolean engineProgression(int question, String answerText) {
        boolean result = false;
        if (answerText.matches("^[\\p{L} ?!,.']+$")
                || answerText.matches("\\s+")
                || answerText.equals("")) {
            Engine.printGameLose(question);
            return result;
        } else if (Integer.parseInt(answerText) != question) {
            Engine.printGameLose(question);
            return result;
        } else if (Integer.parseInt(answerText) == question) {
            System.out.println("Correct!");
            result = true;
        }
        return result;
    }
}
