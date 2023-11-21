public class Operator implements Employee {

    int fixedSalary;
    protected double mounthSalary;


    public int getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(int fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    @Override
    public  double getMonthSalary() {
        mounthSalary = fixedSalary;
        return mounthSalary;

    }

}
