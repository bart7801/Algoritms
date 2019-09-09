package Eukleides;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int counter = 0;
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
            counter++;
        }
        System.out.println("Number of interactions: " + counter);
        System.out.println("NWD: " + a);
    }
}

