package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("X");
        al.add("Y");
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");

        ArrayList arrayList = new ArrayList();
        arrayList.addAll(al);
        System.out.println(arrayList);//[X, Y, A, B, C, D]

        arrayList.removeAll(al);
        System.out.println(arrayList);//[]

        //Sort -- Collections.sort()
        System.out.println("Elements in the array list" + al);//[X, Y, A, B, C, D]
        Collections.sort(al);
        System.out.println("Elements in the array list after sorting " + al);//[A, B, C, D, X, Y]

        Collections.sort(al,Collections.reverseOrder());
        System.out.println("Elements in the array list after sorting in reverse order: " + al);//[Y, X, D, C, B, A]

        //Shuffling

        Collections.shuffle(al);
        System.out.println("After shuffling " + al);//[A, X, D, Y, B, C]




    }
}
