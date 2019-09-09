package ImplementationList;

/*  Napisz program, który będzie pobierał od użytkownika imiona i dodawał je na liste.
    Program powinien pozwolić użytkownikowi na wprowadzenie dowolnej liczby imion
    wprowadzenie „-” jako imienia przerwie wprowadzanie).
    Po zakończeniu wprowadzania przeiteruj sie po liście.   */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<String>();

        for (; ; ) {
            String imie = scanner.next();

            if (imie.equals("-")) {
                break;
            }

            stringList.add(imie);

        }

        for (String element : stringList) {
            System.out.println(element);
        }


    }

}
