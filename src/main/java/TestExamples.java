import java.util.Scanner;

public class TestExamples {
    public static void main(String[] args) {
        int count = 0;
        int[][] a = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                a[i][j] = count++;
            }
        }

    }
}

