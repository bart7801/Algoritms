package Factorial;

// silia

public class App {

    public static double series(int n){

        if(n == 1){
            return 1;
        }
        if (n == 2){
            return 0.5;
        }

        return - series(n-1) * series(n-2);
    }

    public static int series2(int n){
        if(n == 1){
            return -1;
        }
        return -series2(n-1) * n - 3;
    }

    public static int factorial(int n){

        System.out.println(n);

        if(n<2){
            return 1;
        }
        return n * factorial(n-1);

    }

    public static void main( String[] args ) {
        System.out.println(series(5));
        System.out.println(factorial(5));

        // 5! = 5 * 4 * 3 * 2 * 1
        int factorial = 5;
        int score = 1;
        for(int i=1; i<=factorial; i++){
            score = score * i;
        }
        System.out.println("Factorial: " + score);
    }
}