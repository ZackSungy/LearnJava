package Chapter9.map;

import Chapter5.Employee;

import java.util.*;

public class MapTest {
    public static void main(String[] args)
    {
        Map<String, Employee> staff = new HashMap<>();
        staff.put("133",new Employee("Amy Lee"));
        staff.put("567",new Employee("Harry Hacker"));
        staff.put("157",new Employee("Gary Cooper"));
        staff.put("456",new Employee("Francesca Cruz"));

        System.out.println(staff);

        staff.remove("567");

        staff.put("456", new Employee("Francesca Miller"));

        System.out.println(staff.get("152"));

        staff.forEach((k , v) -> System.out.println("key=" + k + ",value=" + v));
    }
}
