package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "0 - Exit\n" +
                "Your choice: ");
        int numberGame = sc.nextInt();
        switch (numberGame) {
            case 1 : Cli.greeting(); break;
            case 2 : Even.gameEven(); break;
            default :
                System.out.println("Enter number of list");
        }
        }
}
