package by.academy.lesson7;

import by.academy.lesson7.task.*;
import by.academy.lesson7.util.Splitter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int m;
        int k;
        int l;
        int r;
        char retry;

        do {
            System.out.print("insert array length:");
            n = scanner.nextInt();
            System.out.print("insert shift:");
            k = scanner.nextInt();

            Task01.execute(n, k);
            Splitter.split();

            Task02.execute(n);
            Splitter.split();

            System.out.print("insert second array length:");
            m = scanner.nextInt();
            Task03.execute(n, m);
            Splitter.split();

            System.out.print("insert new array length:");
            n = scanner.nextInt();
            Task04.execute(n);
            Splitter.split();

            System.out.print("insert max range of array numbers:");
            k = scanner.nextInt();
            Task05.execute(n, k);
            Splitter.split();

            Task06.execute(n);
            Splitter.split();

            System.out.print("insert first index:");
            l = scanner.nextInt();
            System.out.print("insert last index:");
            r = scanner.nextInt();
            Task07.execute(n, l, r);
            Splitter.split();

            System.out.print("retry? y/n: ");
            retry = scanner.next().toLowerCase().charAt(0);
        } while (retry == 'y');
    }

}