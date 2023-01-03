package streams;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int empid;
    String empname;
    int salary;

    Employee(int empid, String empname, int salary){
        this.empid = empid;
        this.empname = empname;
        this.salary = salary;
    }
}

public class MapDemo4 {
    public static void main(String[] args) {

//        List<Employee> employeesList = new ArrayList<>();
//        employeesList.add(new Employee(1, "Alex", 500));

        List<Employee> employeeList = Arrays.asList(
                new Employee(1, "Alex", 1000),
                new Employee(2, "Gela", 20000),
                new Employee(3, "David", 1415)
        );

        //Combination of filter and map
       List<Integer> employeeSalList =  employeeList.stream()
                .filter(e -> e.salary > 20000)//filtering
                .map(e -> e.salary)
                .collect(Collectors.toList());
        System.out.println(employeeSalList);
    }
}
