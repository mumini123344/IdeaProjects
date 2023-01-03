package lambdaexpressionpredicates;

import java.util.function.Predicate;

public class Demo3 {
    public static void main(String[] args) {
        //Joining predicates - and, or, negate
        //p1 --- checks number is even
        //p2 --- checks greater than or not 50

        int a[] = {5,10,  15, 20, 25, 30, 35, 40 ,45, 50, 55, 60, 65};

        Predicate<Integer> p1 = i -> i % 2 == 0;
        Predicate<Integer> p2 = j -> j > 50;

        //and
        for (int n : a){
            if (p1.test(n) && p2.test(n))//if(p1.and(p2).test(n))
            {
                System.out.println(n);
            }
        }

        //or
        for (int m : a){
            if (p1.or(p2).test(m)){
                System.out.println(m);
            }
        }

        //negate
        for (int s : a){
            if (p1.negate().test(s)){
                System.out.println(s);
            }
        }


    }
}
