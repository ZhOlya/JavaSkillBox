import java.util.Random;

public class Manager implements Employee {

    protected double moneyForCompany; //earned money for company per mounth
    static int fixedSalary;
    protected double mounthSalary;



    public double getMoneyForCompany() {
        return moneyForCompany;
    }

    public int getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(int fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    //method for determining earnings for company
    protected void earnedMoneyForCompany(){
        int max = 140_000;
        int min = 115_000;
        Random randomEarn = new Random();
        moneyForCompany =randomEarn.nextInt(max - min + 1) + min;
    }

    @Override
    public double getMonthSalary() {
        earnedMoneyForCompany();
        mounthSalary = fixedSalary + (moneyForCompany * 0.05);
        return mounthSalary;
    }
}
