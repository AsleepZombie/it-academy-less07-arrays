package by.academy.lesson7.task;

import by.academy.lesson7.util.UtilArray;

public class Task04 {
    public static void execute(int n) {
        int[] a = new int[n];
        UtilArray.fillAndPrint(a);

        System.out.println("second biggest number: " + findMax(a, 2));

    }

    private static int findMax(int[] array, int number) {
        int max = 0;
        int maxNum;
        while (number-- > 0) {
            max = array[0];
            maxNum = 0;
            for (int i = 1; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                    maxNum = i;
                }
            }
            array[maxNum] = Integer.MIN_VALUE;
        }
        return max;
    }
}
