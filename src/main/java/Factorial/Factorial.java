package Factorial;

import java.util.Scanner;

public class Factorial {
        public static void main (String[]args ){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number from which you want to calculate the factorial:");
            int factorial = scanner.nextInt();
            int score = 1;
            for (int i = 1; i <= factorial; i++) {
                score = score * i;
            }
            System.out.println("Factorial from: " + factorial + "!" + " is: " + score);
        }
    }