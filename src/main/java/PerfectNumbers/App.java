package PerfectNumbers;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number to check:");
        int x = scanner.nextInt();

        int sum_of_division = 0;
        int i = 1;

        while (i <= x / 2) {
            if (x % i == 0) {
                sum_of_division = sum_of_division + i;
            }
            i = i + 1;
        }
        if (x == sum_of_division) {
            System.out.println(x + " is a perfect number");
        } else {
            System.out.println(x + " is not a perfect number");
        }
    }
}

