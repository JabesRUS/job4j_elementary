package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if (counter == 0) {
                result += input.charAt(i);
                counter++;
            } else if (input.charAt(i) == result.charAt(result.length() - 1)) {
                counter++;
            } else if (input.charAt(i) != result.charAt(result.length() - 1)) {
                result += counter == 1 ? "" : counter;
                counter = 1;
                result += input.charAt(i);
            } else if (counter != 1 && i == input.length() - 1) {
                result += counter;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(encode("qqwwwer"));
    }
}
