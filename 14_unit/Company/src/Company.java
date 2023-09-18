import java.util.ArrayList;
import java.util.Collection;

public class Company {

    private String nameCompany;
    private int amountWorkers;
    double incomeOfCompanyPerMonth;

    private ArrayList<Employee> workers = new ArrayList<>();

    public Company(String nameCompany, int amountWorkers) {
        this.nameCompany = nameCompany;
        this.amountWorkers = amountWorkers;
    }

    public void hire(Employee empoyee) {
        if (empoyee == null) {
            return;
        }
        workers.add(empoyee);
    }

    public void hireAll(Collection<Employee> employes) {
        if (employes == null) {
            return;
        }
        workers.add((Employee) employes);
    }

    public void fire(Employee employee) {
        if (employee == null) {
            return;
        }
        workers.remove(employee);
    }

    public double getIncomeOfCompanyPerMonth() {
        for (Employee employee : workers) {
            incomeOfCompanyPerMonth += employee.getMonthSalary();
        }
        return incomeOfCompanyPerMonth;
    }

    public void operatorFixedSalary(int salary) {
        Operator fixSalary = new Operator();
        fixSalary.setFixedSalary(salary);
    }

    public int getOperatorSalary() {
        Operator op = new Operator();
        op.getMonthSalary();
    }


    // Get TOP and LOW salary

//    public  ArrayList <Employee> getTopSalaryStuff (int count){
//        if (workers == null) {
//            return null;
//        }
//        workers.sort();
//    }


}
