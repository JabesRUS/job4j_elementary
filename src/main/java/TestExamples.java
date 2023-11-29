import java.util.Scanner;

public class TestExamples {
    public static void numCheck(int number) {
        boolean result = true;
        if (number % 10 % 2 == 0) {
            result = false;

        }
        System.out.println(result);
    }
}
