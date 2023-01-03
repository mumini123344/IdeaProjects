package streams;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo1 {
    public static void main(String[] args) {

        List<String > vehicles = Arrays.asList("bus", "car", "bicycle", "plane", "train");
        List<String> vehiclesListInUpperCase = new ArrayList<>();

        //without using streams
//        List<String> vehiclesListInUpperCase = new ArrayList<>();
//
//        for (String name:vehicles){
//            vehiclesListInUpperCase.add(name.toUpperCase());
//
//        }
//        System.out.println(vehiclesListInUpperCase);

        //Streams - Map

       vehiclesListInUpperCase  = vehicles.stream().map(name->name.toUpperCase()).collect(Collectors.toList());

        System.out.println(vehiclesListInUpperCase);
    }
}
