package by.academy.lesson7.task;

import by.academy.lesson7.util.UtilArray;

public class Task02 {
    public static void execute(int n) {
        int[] a = new int[n];
        int count = 0;
        do {
            UtilArray.fillLess(a);
            if (++count > 500) {
                System.out.println("no luck, last one:");
                UtilArray.print(a);
                return;
            }
        }
        while (!isPalindrome(a));
        System.out.println("found one:");
        UtilArray.print(a);
    }

    private static boolean isPalindrome(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != array[array.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
