package lambdaexpressions;

@FunctionalInterface
interface Car{
    public String carBooking(String source, String destination);
}

//class Transporting implements Car{
//    public String carBooking(String source, String destination){
//        System.out.println("Car im moving from " + source + " to " + destination);
//        return ("Price : 500$");
//    }
//}

public class Test3 {
    public static void main(String[] args) {
        Car car = (String source, String destination) -> {System.out.println("Car is moving from " + source + " to " + destination);
            return ("Price : 500$");};
        System.out.println(car.carBooking("Germany", "Georgia"));
    }
}
