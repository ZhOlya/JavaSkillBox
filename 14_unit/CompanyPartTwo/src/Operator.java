public class Operator extends BaseEmployee{


    public Operator(int fixedSalary, Company company) {
        super(fixedSalary, company);
    }


    @Override
     double applyMonthSalary() {
        salaryPerMonth = fixedSalary;
        return salaryPerMonth;
    }

    @Override
    public String toString() {
        return "Operator`s salary " + salaryPerMonth;
    }
}
