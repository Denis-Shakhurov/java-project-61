package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.Calc;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;
import java.util.Scanner;

public class App {
    public static Engine engine = new Engine();
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
            case 1 : engine.greeting(); break;
            case 2 : Even.gameEven(); break;
            case 3 : Calc.gameCalc(); break;
            case 4 : GCD.gameGsd(); break;
            case 5 : Progression.gameProgression(); break;
            case 6 : Prime.gamePrime(); break;
            case 0 : return;
            default :
                System.out.println("Enter number of list");
        }
    }
}
