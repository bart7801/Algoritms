package EratosthenesSieve;

// 0 - false
// 1 - true

import java.util.Arrays;
public class Erastotenes {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(sito(100)));

        int[] tab = sito(100);

        for (int i=0; i<tab.length; i++){

            System.out.println(tab[i]);
        }
    }

    public static int[] sito(int n) {

        int[] T = new int[n+1];
        // defaultowo jet wypelniona zerami
        // gdy cos wykreslamy to 1.

        int i = 2;
        int w = 0;
        while (!(i >= n)) {

            w = i + i;
            while (!(w > n)) {

                T[w] = 1;

                w = w + i;

            }

            i = i + 1;

        }
        //wilekosc nowej tablicy

        int count =0;

        for (int j = 2; j <= n ; j++) {

            if (T[j] == 0){

                count++;

            }

        }
        //nowa tablica

        int[] tabwynik = new int[count];

        int z =0;

        for (int j = 2; j <= n ; j++) {

            if (T[j] == 0){

                tabwynik[z++]= j;

            }

        }
        return tabwynik;

    }

}