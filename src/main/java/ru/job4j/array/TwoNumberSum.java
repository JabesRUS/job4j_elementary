package ru.job4j.array;

public class TwoNumberSum {
//    public static int[] getIndexes(int[] array, int target) {
//        int i = 0;
//        int j = 1;
//        while (i < array.length) {
//            if ((j < array.length) && (array[i] + array[j] == target)) {
//                return new int[] {i, j};
//            }
//
//            if (j >= array.length - 1) {
//                i++;
//                j = i + 1;
//            } else {
//                j++;
//            }
//
//        }
//        return new int[0];
//    }

    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        while (i < array.length) {
            if ((j < array.length) && (array[i] + array[j] == target)) {
                return new int[] {i, j};
            }

            if (i != j) {
                j--;
            } else {
                i++;
                j = array.length - 1;
            }

        }
        return new int[0];
    }
}
