package hexlet.code;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Engine {

    public static void engineGame(List<Map<String, String>> list, String ruleGame) {
        Scanner sc = new Scanner(System.in);
        String answer = "";
        String name = "";
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(ruleGame);

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
