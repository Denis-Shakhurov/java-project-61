package hexlet.code;

public class Utils {
    public static int getRandomInt(int min, int max) {
        return (int) (min + Math.random() * max + 1);
    }
}
