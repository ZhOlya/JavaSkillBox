import java.util.Random;

public class Manager extends BaseEmployee {

    public Manager(int fixedSalary, Company company) {
        super(fixedSalary, company);
    }

    double monthEarning;

    public double generateMoneyEarnedByManagner(){
        int max = 140_000;
        int min = 115_000;
        Random randomEarn = new Random();
        monthEarning = randomEarn.nextInt(max - min + 1) + min;
        company.ChangeIncome(monthEarning);
        return monthEarning;
    }

    public  void definitionOfPremium(){
        premium = monthEarning * 0.05;
    }

    @Override
     double applyMonthSalary() {
        generateMoneyEarnedByManagner();
        definitionOfPremium();
        salaryPerMonth = fixedSalary + premium;
        return salaryPerMonth;
    }

    @Override
    public String toString() {
        return "Manager`s salary " + salaryPerMonth;
    }
}
