public class Operator {

    static int fixedSalary;
    static int monthSalary;

    public int getFixedSalary() {
        return fixedSalary;
    }

    public void setFixedSalary(int fixedSalary) {
        this.fixedSalary = fixedSalary;
    }

    public int getMonthSalary(){
        monthSalary = fixedSalary;
        return monthSalary;
    }
}
