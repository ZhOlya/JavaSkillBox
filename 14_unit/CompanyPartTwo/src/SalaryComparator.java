import java.util.Comparator;

public class SalaryComparator implements Comparator<BaseEmployee> {


    @Override
    public int compare(BaseEmployee employee1, BaseEmployee employee2) {
        double parametr1 = employee1.getSalaryPerMonth();
        double parametr2 = employee2.getSalaryPerMonth();
        if (parametr1 > parametr2){
            return -1;
        } else if (parametr1 < parametr2) {
            return 1;
        } else {
            return 0;
        }
    }
}
