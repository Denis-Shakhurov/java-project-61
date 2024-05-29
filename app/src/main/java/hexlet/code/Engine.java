package hexlet.code;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Engine {
    private static Scanner sc = new Scanner(System.in);
    private static String answer = "";
    private static String name = "";
    private static Map<String, String> mapGame = new HashMap<>();

    static {
        mapGame.put("Even", "Answer 'yes' if the number is even, otherwise answer 'no'.");
        mapGame.put("Calc", "What is the result of the expression?");
        mapGame.put("GCD", "Find the greatest common divisor of given numbers.");
        mapGame.put("Progression", "What number is missing in the progression?");
        mapGame.put("Prime", "Answer 'yes' if given number is prime. Otherwise answer 'no'.");
    }

    public static void engineGame(List<Map<String, String>> list, String nameGame) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(mapGame.get(nameGame));

        int count = 0;

        for (Map<String, String> map : list) {
            for (String key : map.keySet()) {
                String value = map.get(key);
                System.out.println("Question: " + key);
                System.out.print("Your answer: ");
                answer = sc.nextLine();
                if (value.equals(answer)) {
                    System.out.println("Correct!");
                    count++;
                } else {
                    System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '"
                                  + value + "'.\n" + "Let's try again, " + name + "!");
                    return;
                }
            }
        }

        if (count == list.size()) {
            System.out.println("Congratulations, " + name + "!");
        }
    }
}
