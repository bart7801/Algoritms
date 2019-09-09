package Fibonacci;

//Fibonacci

import java.util.Scanner;

public class App {
    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }

    public static void fibonacci2() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the expression a Fibonacci sequence:");

        int N = scanner.nextInt();
        if (N < 2) {
            System.out.println(N);
        } else {
            int A = 0;
            int B = 1;
            int C = 1;
            int K = 2;

            while (K < N) {
                A = B;
                B = C;
                C = A + B;
                K++;
            }
            System.out.println("Word of string " + N + " Fibonacci is: " + C);
        }

    }

    public static void main(String[] args) {
        fibonacci2();
        System.out.println("for the first 30 consecutive F words of the Fibonacci sequence: ");
        //System.out.println(fibonacci(30));
        int tab[] = new int[30];
        tab[0] = 0;
        tab[1] = 1;
        for (int i = 2; i < tab.length; i++) {
            tab[i] = tab[i - 1] + tab[i - 2];

            System.out.println(tab[i]);
        }
    }
}