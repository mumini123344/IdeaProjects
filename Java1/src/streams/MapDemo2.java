package streams;

import java.util.Arrays;
import java.util.List;

public class MapDemo2 {
    public static void main(String[] args) {

        List<String > vehicles = Arrays.asList("bus", "car", "bicycle", "plane", "train");

        //without stream
//        for (String name:vehicles){
//            System.out.println(name.length());
//        }

        //Using stream
        vehicles.stream().map(vname -> vname.length()).forEach(len  -> System.out.println(len));

    }
}
