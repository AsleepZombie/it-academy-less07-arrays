package by.academy.lesson7.task;

import by.academy.lesson7.util.UtilArray;

public class Task06 {
    public static void execute(int n) {
        int[] a = new int[n];
        int[] b;
        UtilArray.fillAndPrint(a);

        b = removeDuplicate(a);
        UtilArray.print(b);
    }

    private static int[] removeDuplicate(int [] array) {
        boolean[] arrayDuplicate = new boolean[array.length];
        int count = 0;
        int[] arrayResult;
        int i;
        int j;

        for (i = array.length - 1; i >= 1; i--) {
            for (j = i - 1; j >= 0; j--) {
                if ((array[i] == array[j]) && (!arrayDuplicate[i])) {
                    arrayDuplicate[i] = true;
                    count++;
                    break;
                }
            }
        }
        arrayResult = new int[array.length - count];
        j = 0;
        for (i = 0; i < array.length; i++) {
            if (!arrayDuplicate[i]) {
                arrayResult[j++] = array[i];
            }
        }
        UtilArray.print(arrayDuplicate);
        return arrayResult;
    }
}
