package by.academy.lesson7.task;

import by.academy.lesson7.util.UtilArray;

public class Task01 {

    public static void execute(int n, int k) {
        int[] a = new int[n];
        UtilArray.fillAndPrint(a);

        shiftRight(a, k);
        UtilArray.print(a);
    }

    private static void shiftRight(int[] array, int shift) {
        if (array.length == 0 || shift <= 0) {
            return;
        }

        int lastToFirst;

        while (shift-- > 0) {
            lastToFirst = array[array.length - 1];
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = lastToFirst;
        }
    }
}
