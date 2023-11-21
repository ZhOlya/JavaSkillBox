import java.text.CollationElementIterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        sortBySalaryAndAlphabet(staff);
        System.out.println(staff);
    }

    public static void sortBySalaryAndAlphabet(List<Employee> staff) {
        staff.stream().sorted(Comparator.comparing(Employee::getSalary)).forEach(System.out::println);

//        Collections.sort(staff, (o1, o2) ->{
//             int comp = o1.getSalary().compareTo(o2.getSalary());
//             if (comp == 0){
//                 return o1.getName().compareTo(o2.getName());
//             }
//            return comp;
//        } );
        //TODO Метод должен отсортировать сотрудников по заработной плате и алфавиту.
    }
}