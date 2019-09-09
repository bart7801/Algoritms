package ArithmeticProgression;

// n – liczba wyrazów ciągu do wygenerowania
// a1 – pierwszy wyraz ciągu,
// d – przyrost     a = a + (i - 1) x d

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszy wyraz ciagu: ");
        int a1 = scanner.nextInt();
        System.out.println("Podaj przyrost ciagu: ");
        int d = scanner.nextInt();
        System.out.println("Podaj ilosc wyrazow ciagu: ");
        int n = scanner.nextInt();
        System.out.print(a1 + ", ");

        int next;

        for (int i = 2; i <= n; i++) {

            next = a1 + (i - 1) * d;

            System.out.print(next + ", ");
        }
    }
}