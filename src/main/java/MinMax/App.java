package MinMax;

public class App
{
    public static void main( String[] args )
    {
        int [] a = {4,6,2,1,3};
        int score = a[0];
        int maximum = a[0];

        for(int i=1; i<a.length; i++){
            if(a[i] < score){
                score = a[i];
            }
        }
        for(int i=1; i<a.length; i++){
            if(a[i] > maximum){
                maximum = a[i];
            }
        }

        System.out.println("Minimal element: " + score);
        System.out.println("Maximum element: " + maximum);
    }
}
