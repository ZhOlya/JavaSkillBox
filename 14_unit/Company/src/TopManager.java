public class TopManager implements Employee {

    static int fixedSalary;
    protected double mounthSalary;


    double incomeInMounth;

    public int getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(int fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double getMonthSalary() {
        if (incomeInMounth >= 10_000_000) {
            mounthSalary = fixedSalary + (fixedSalary * 1.5);
        } else {
            mounthSalary = fixedSalary;
        }
        return mounthSalary;
    }
}
