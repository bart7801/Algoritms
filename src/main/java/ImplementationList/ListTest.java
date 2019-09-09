package ImplementationList;

public class ListTest {

    public static void main(String[] args){

        MyList<Integer> list = new ListImpl<>();
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        list.add(555);
        list.add(666);
        list.add(777);
        list.add(888);
        list.add(999);
        list.add(101010);
        list.add(111111);
        list.add(121212);
        list.add(131313);
        list.add(141414);
        list.remove(2);

        MyList<Integer> list1 = new LinkedListImpl<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        System.out.println(list1);
        list1.printList();

    }
}
