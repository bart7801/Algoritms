package QuickSort;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static int sum(int[] tab) {

        if (tab.length == 0) {

            return 0;

        }

        int[] tab2 = new int[tab.length - 1];

        for (int i = 0; i < tab.length - 1; i++) {

            tab2[i] = tab[i + 1];

        }

        return tab[0] + sum(tab2);

    }

    public static void main(String[] args) {

        int[] tab = {2, 4, 6, 2, 2};

        System.out.println(sum(tab));

        List<Integer> list = new ArrayList<>();

    }

}