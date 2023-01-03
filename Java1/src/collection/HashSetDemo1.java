package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
    public static void main(String[] args) {
        //HashSet hs =  new HashSet(100);//Initial capacity 100
        //HashSet hs = new HashSet(100, (float)0.90);
        //HashSet<Integer> hs = new HashSet<>();
        HashSet hs = new HashSet();//Default capacity 16 Load Factor 0.75

        //Add objects/elements into HashSet

        hs.add(100);
        hs.add("Welcome");
        hs.add(15.1);
        hs.add('a');
        hs.add(true);
        hs.add(null);

        System.out.println(hs);//[null, a, 100, Welcome, 15.1, true] //Insertion order not preseved

        //remove()

        hs.remove('a');
        System.out.println("After removing " + hs);//[null, 100, Welcome, 15.1, true]

        //contains()
        System.out.println(hs.contains("Welcome"));//true

        System.out.println(hs.isEmpty());//false

        //Reading objects/elements from HashSet using for..each loop
//        for (Object e:hs){
//            System.out.println(e);
//        }

//
//        Iterator it = hs.iterator();
//
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
    }
}
