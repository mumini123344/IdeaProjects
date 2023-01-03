package lambdaexpressionpredicates;

import java.util.function.Predicate;

public class Demo1 {
    public static void main(String[] args) {
// Predicate ----> one parameter returns boolean
// use only if you have conditional checks in your program...

        //Example1
        Predicate<Integer> p = i -> (i > 10);
        System.out.println(p.test(20));//true
        System.out.println(p.test(5));//false

        //Ex2 : check the length of give string is greater than  or not
        Predicate<String> s = j -> (j.length()>4);
        System.out.println(s.test("University"));//true
        System.out.println(s.test("Car"));//false

        //Ex3
        String names[] = {"David", "Scott", "Smith", "John", "Mary"};
        for (String name : names){
            if (s.test(name)){
                System.out.println(name);
            }
        }









    }


}
