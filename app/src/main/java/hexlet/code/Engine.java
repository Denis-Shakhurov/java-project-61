package hexlet.code;

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
}
