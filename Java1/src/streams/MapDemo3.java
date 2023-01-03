package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo3 {
    public static void main(String[] args) {

        List<Integer> numbersList = Arrays.asList(2, 3, 4, 5);
        List<Integer> mulList = new ArrayList<>();

        //before streams
//        for (int num:numbersList){
//            //System.out.println(num * 3);
//            mulList.add(num * 3);
//            //System.out.println(mulList);
//        }
//        System.out.println(mulList);

        //Streams
//        mulList = numbersList.stream().map(num -> num * 3).collect(Collectors.toList());
//        System.out.println(mulList);

        //OR
        numbersList.stream().map(num -> num * 3).forEach(num -> System.out.println(num));//Lambda
        numbersList.stream().map(num -> num * 3).forEach(System.out::println);

    }



}
