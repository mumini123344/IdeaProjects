package collection;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //Declare ArrayList

        //ArrayList al = new ArrayList();
        //ArrayList<Integer> al = new ArrayList<>();
        //ArrayList<String> al = new ArrayList<>();
        //List al = new ArrayList();

        ArrayList al = new ArrayList();

        //Add new elements to the arraylist

        al.add(100);
        al.add("Welcome");
        al.add(15.5);
        al.add('A');
        al.add(true);

        System.out.println(al); //[100, Welcome, 15.5, A, true]
        
        //size()
        System.out.println("Number of elements in array list: " + al.size()); //5

        //remove
        al.remove(1); // here 1 is index
        //al.remove("Welcome"); //here Welcome is element
        System.out.println("After removing element from array list: " + al); //[100, 15.5, A, true]

        //insert a new element
        //add(index, object)
        al.add(2, "Georgia");
        System.out.println("After insertion: " + al);//[100, 15.5, Georgia, A, true]

        //Retrive a specific element
        System.out.println(al.get(3)); //A, here 3 is index of element/object

        //change/replace element
        al.set(3, "Cool");
        System.out.println("After replacing element: " + al);//[100, 15.5, Georgia, Cool, true]

        //Search - contains() - RETURNS - true/false
        System.out.println(al.contains("Georgia"));//true
        System.out.println(al.contains(200));///false

        //isEmpty() - returns - true/false
        System.out.println(al.isEmpty());//false

        //1) for loop
//        System.out.println("Reading elements using for loop........");
//        for (int i=0;i<=al.size();i++){
//            System.out.println(al.get(i));
//
//        }




        //2) for..each loop
//        System.out.println("Reading elements using for..each loop.....");
//        for(Object e:al){
//            System.out.println(e);
//        }





        //3) iterator()
//        System.out.println("Reading elements using iterator method");
//        Iterator it= al.iterator();
//        while(it.hasNext()){
//            System.out.println(it.next());
//        }








    }
}
