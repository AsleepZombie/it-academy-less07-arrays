package by.academy.lesson7.task;

import by.academy.lesson7.util.UtilArray;

public class Task07 {
    public static void execute(int n, int l,int r) {
        int[] a = new int[n];
        UtilArray.fillAndPrint(a);

        reversePart(a, l, r);
        UtilArray.print(a);
    }

    private static void reversePart(int[] array, int indexStart, int indexFinish) {
        if ((indexStart < 0) || (indexStart > indexFinish) || (indexFinish) >= array.length) {
            System.out.println("wrong indexes");
            return;
        }
        int[] arrayPart = new int[indexFinish - indexStart + 1];
        int i;
        int j = 0;
        for (i = indexStart; i <= indexFinish; i++) {
            arrayPart[j++] = array[i];
        }
        j = 0;
        for (i = indexFinish; i >=indexStart ; i--) {
            array[i] = arrayPart[j++];
        }
        UtilArray.print(arrayPart);
    }
}
