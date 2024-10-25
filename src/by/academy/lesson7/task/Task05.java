package by.academy.lesson7.task;

import by.academy.lesson7.util.UtilArray;

public class Task05 {
    public static void execute(int n, int k) {
        int[] a = new int[n];
        int[] f;
        UtilArray.fillExact(a, 1, k);
        UtilArray.print(a);

        f = numCount(a, k);
        UtilArray.print(f);
    }

    private static int[] numCount(int[] array, int max) {
        int count;
        int[] arrayResult = new int[max + 1];

        for (int number = 1; number <= max; number++) {
            count = 0;
            for (int arrayNumber : array) {
                if (arrayNumber == number) {
                    count++;
                }
            }
            arrayResult[number] = count;
        }
        return arrayResult;
    }
}
