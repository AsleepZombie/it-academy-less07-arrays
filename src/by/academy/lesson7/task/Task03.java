package by.academy.lesson7.task;

import by.academy.lesson7.util.UtilArray;

public class Task03 {
    public static void execute(int n, int m) {
        int[] a = new int[n];
        int[] b = new int[m];
        int[] c;
        UtilArray.fillAndPrint(a);
        UtilArray.fillAndPrint(b);

        c = merge(a, b);
        UtilArray.print(c);
        sort(c); //можно было Arrays.sort(c);
        UtilArray.print(c);

    }

    private static int[] merge(int[] array1, int[] array2) {
        int i;
        int k = 0;
        int [] arrayResult = new int[array1.length + array2.length];

        for (i = 0; i < array1.length; i++) {
            arrayResult[k++] = array1[i];
        }
        for (i = 0; i < array2.length; i++) {
            arrayResult[k++] = array2[i];
        }
        return arrayResult;
    }


    private static void sort(int[] array) {
        int min;
        int minNum;
        for (int i = 0; i < array.length - 1; i++) {
            min = array[i];
            minNum = i;
            for (int j = i; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    minNum = j;
                }
            }
            if (minNum != i) {
                array[minNum] = array[i];
                array[i] = min;
            }
        }
    }
}
