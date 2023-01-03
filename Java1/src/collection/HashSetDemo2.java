package collection;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {

        HashSet<Integer> evenNumber = new HashSet<>();
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);

        System.out.println("HashSet: " + evenNumber);//[2, 4, 6]

        HashSet<Integer> numbers = new HashSet();

        numbers.addAll(evenNumber);
        numbers.add(10);
        System.out.println("New HashSet: " + numbers);//[2, 4, 6, 10]


        //removeALL()

        numbers.removeAll(evenNumber);
        System.out.println(numbers);


    }
}
