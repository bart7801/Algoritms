package ImplementationList;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        //typy generyczne

      /*  Box<Integer> box1 = new Box(new Integer(12));
        Box<Integer> box12 = new Box(12); //to jest to samo, kompilator "wie" ze to Integar
        Box<Float> box2 = new Box(new Float(12.32));
        Box<String> box3 = new Box<>(new String("Hej skoloy"));*/


        List<Integer> integarList = new ArrayList<Integer>();

        integarList.add(21);
        integarList.add(23431);
        integarList.add(23531);
        integarList.add(235341);
        integarList.add(235351);
        integarList.add(2661);
        integarList.add(21);


        for (Integer integer : integarList) {
            System.out.println(integer);
        }


        for (int i = 0; i < integarList.size(); i++) {
            System.out.println(integarList.get(i));
        }


    }
}