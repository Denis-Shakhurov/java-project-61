package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    private static final int GAME_NUMBER_1 = 1;
    private static final int GAME_NUMBER_2 = 2;
    private static final int GAME_NUMBER_3 = 3;
    private static final int GAME_NUMBER_4 = 4;
    private static final int GAME_NUMBER_5 = 5;
    private static final int GAME_NUMBER_6 = 6;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit\n"
                + "Your choice: ");
        int numberGame = sc.nextInt();
        switch (numberGame) {
            case GAME_NUMBER_1 : Cli.greeting(); break;
            case GAME_NUMBER_2 : Even.gameEven(); break;
            case GAME_NUMBER_3 : Calc.gameCalc(); break;
            case GAME_NUMBER_4 : GCD.gameGsd(); break;
            case GAME_NUMBER_5 : Progression.gameProgression(); break;
            case GAME_NUMBER_6 : Prime.gamePrime(); break;
            case 0 : return;
            default :
                System.out.println("Enter number of list");
        }
    }
}
