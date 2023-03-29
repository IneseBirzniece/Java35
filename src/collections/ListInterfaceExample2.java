package collections;

import java.util.ArrayList;

public class ListInterfaceExample2 {
    public static void main(String[] args) {
        //example 1

        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        System.out.println("List = " + List);


        ArrayList<Integer> list2 = new ArrayList<>(List);
        System.out.println("list2 = " + list2);
        list2.add(5);
        list2.add(6);
        list2.add(7);

        //for loop
        for (int i = 0; i < list2.size(); i++){
            System.out.print(list2.get(i) + " ");
        }
        System.out.println();

        //for-each loop
        for (Integer k: list2) {
            System.out.print(k + " ");
        }



    }
}
