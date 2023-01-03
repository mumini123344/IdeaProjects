package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class MainForCollection {
    public static void main(String[] args) {

        //Sorting
        ArrayList<Integer> numbers =
                new ArrayList<>(Arrays.asList(1, 4, 2, 6, 9));
        Collections.sort(numbers);
        System.out.println(numbers);

        numbers.add(7);
        Collections.addAll(numbers,11, 3, 26);
        numbers.remove(3);
        System.out.println(numbers.get(4));
        numbers.set(2, 0);
        //Collections.sort(numbers);
        System.out.println(numbers);
    }
}
