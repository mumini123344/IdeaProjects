package lambdaexpressionpredicates;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Predicate;

class Employee{
    String eName;
    int salary;
    int experience;

    Employee(String name, int sal, int exp){
        eName = name;
        salary = sal;
        experience = exp;
    }
}


public class Demo2 {
    public static void main(String[] args) {

        //Ex1   
        Employee emp = new Employee("John", 3000, 5);

        //emp obj ---> return name if salary>2k exp>3
        Predicate<Employee> pr = e -> (e.salary>2000 && e.experience>3);
        System.out.println(pr.test(emp));//true

        //Ex2
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee("Mark", 50000, 5));
        al.add(new Employee("David", 20000, 2));
        al.add(new Employee("Scott", 30000, 3));
        al.add(new Employee("John", 40000, 6));

        for (Employee e : al){
            if(pr.test(e)){
                System.out.println(e.eName + "   " + e.salary);
            }
        }

    }
}
