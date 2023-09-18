public class TopManager extends BaseEmployee{

    public TopManager(int fixedSalary, Company company) {
        super(fixedSalary, company);
    }

    public  void definitionOfPremium(){
        if (company.getIncome() >= 1_000_000){
            premium = fixedSalary * 1.5;
        } else {
            premium = 0;
        }
    }

    @Override
     double applyMonthSalary() {
        definitionOfPremium();
        salaryPerMonth = fixedSalary + premium;
        return salaryPerMonth;
    }

    @Override
    public String toString() {
        return "TopManager`s salary " + salaryPerMonth ;
    }
}
