package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void gameEven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int count = 0;
        while (count < 3) {
            int randomNumber = (int) (Math.random() * (200 + 1)) + 1;
            System.out.println("Question: " + randomNumber);
            System.out.print("Your answer: ");
            String answer = sc.nextLine();
            if ((randomNumber % 2 == 0 && answer.equals("yes")) ||
                    (randomNumber % 2 != 0 && answer.equals("no"))) {
                System.out.println("Correct!");
                count++;
            } else if (!(answer.equals("yes")) || !(answer.equals("no"))) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.\n" +
                        "Let's try again, " + name);
                break;
            }
            if (count == 3) {
                System.out.println("Congratulations, " + name);
            }
        }
    }
}
