import java.util.ArrayList;
import java.util.List;

public class MultipleStreams {


    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1,"Arumugam", 5));
        employees.add(new Employee(2,"Yash", 2));
        employees.add(new Employee(3,"Ayush", 10));
        employees.add(new Employee(4,"Harsh", 8));
        employees.add(new Employee(5,"Nigam", 3));
        employees.add(new Employee(6,"Priyank", 1));
        employees.add(new Employee(7,"Parth", 4));
        employees.add(new Employee(8,"Jayesh", 6));

        //With Loops and Methods

//        int employeeYearsAboveFive = 0;
//
//        for(Employee e: employees)
//        {
//            if(e.getYearsOfService() > 5)
//            {
//                employeeYearsAboveFive++;
//            }
//        }


        //Using Streams
        long employeeYearsAboveFive = employees.stream().filter(e-> e.getYearsOfService() > 5).count();



        System.out.println(employeeYearsAboveFive);


        //With Loops and Methods
//        List<Employee> nameStartsWithP = new ArrayList<>();
//
//         for(Employee e : employees)
//         {
//             if(e.getFirstName().startsWith("P"))
//             {
//                 nameStartsWithP.add(e);
//             }
//         }
//
//         for(Employee n: nameStartsWithP)
//         {
//             System.out.println(n.getFirstName());
//         }

    //With Streams

        List<Employee> nameStartsWithA = employees.stream()
                .filter(e-> e.getFirstName().startsWith("A"))
                .toList();

        nameStartsWithA.forEach(n-> System.out.println(n.getFirstName()));



    }
}
