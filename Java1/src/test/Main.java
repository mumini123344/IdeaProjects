package test;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] friendsArray = {"John", "Chris", "Eric", "Luke"};

        ArrayList<String> friendsArrayList =
                new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Luke"));
        //Get element
        System.out.println(friendsArray[1]);
        System.out.println(friendsArrayList.get(2));

        //Get size
        System.out.println(friendsArray.length);
        System.out.println(friendsArrayList.size());

        //Add an element
        //Can't do that with Arrays
        friendsArrayList.add("Mitch");
        System.out.println(friendsArrayList.get(4));

        //Set an element
        friendsArray[0] = "Carl";
        System.out.println(friendsArray[0]);
        friendsArrayList.set(3, "Rati");

        //Remove an element
        //Can't do this with Arrays
        friendsArrayList.remove(1);

        //Print
        System.out.println(Arrays.toString(friendsArray));
        System.out.println(friendsArrayList);

        System.out.println(friendsArrayList.stream().count());
    }
}
