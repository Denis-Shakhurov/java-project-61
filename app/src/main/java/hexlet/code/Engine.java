package hexlet.code;

import java.util.Map;
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
    public static void questionAndAnswer(String text) {
        System.out.println("Question: " + text);
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
    public static void engineGame(Map<String, String> maps) {
        int count = 0;
        for (String key : maps.keySet()) {
            String value = maps.get(key);
            questionAndAnswer(key);
            if (value.equals(getAnswer())) {
                System.out.println("Correct!");
                count++;
            } else {
                printGameLose(value);
                return;
            }
        }
        if (count == maps.size()) {
            printGameWin();
        }
    }
}
