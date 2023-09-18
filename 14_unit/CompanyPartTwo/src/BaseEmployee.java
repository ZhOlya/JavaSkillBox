import java.util.Comparator;

public abstract class  BaseEmployee {

    int fixedSalary;
    double salaryPerMonth;
    Company company;

    public double getSalaryPerMonth() {
        return salaryPerMonth;
    }

    double premium;

    public BaseEmployee(int fixedSalary, Company company) {
        this.fixedSalary = fixedSalary;
        this.company = company;
        this.salaryPerMonth = applyMonthSalary();
    }

     abstract double applyMonthSalary();




}
