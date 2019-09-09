package Average;

// counting the arithmetic average, the first given tells you how
// many times you enter the data to calculate the arithmetic average

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            result = result + a;

        }
        result = result / n;
        System.out.println(result);

    }
}
