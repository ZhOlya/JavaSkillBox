import java.util.*;

public class Company {

    String name;
    //int amountWorkers;
    private double totalIncome;
    // public String PACKAGE_NAME = "com.CompanyPartTwo";

    ArrayList<BaseEmployee> workers = new ArrayList<>();
    SalaryComparator comparator = new SalaryComparator();


    public ArrayList<BaseEmployee> getTopSalaryStuff(int count) {
        Collections.sort(workers, comparator);
        return new ArrayList<BaseEmployee>(workers.subList(0, count));
    }

    public ArrayList<BaseEmployee> getLowSalaryStuff(int count) {
        Collections.sort(workers, comparator);
        int newIndex = workers.size() - 1;
        return new ArrayList<>(workers.subList(newIndex - count, newIndex));
    }


    public void ChangeIncome(double addMoney) {
        totalIncome += addMoney;
        if (totalIncome < 0)
            totalIncome = 0;
    }

    public double getIncome() {
        return totalIncome;
    }

    public Company(String name) {
        this.name = name;
    }

    public Company getCompany() {
        return this;
    }

    public void hire(BaseEmployee employee) {
        if (employee == null) {
            return;
        }
        workers.add(employee);
    }

    public void hireAll(List<BaseEmployee> employees) {
        if (employees == null) {
            return;
        }
        workers.addAll(employees);
    }

    public void fire(BaseEmployee employee) {
        if (employee == null) {
            return;
        }
        workers.remove(employee);
    }

        @Override
        public String toString () {
            return "Company " +
                    "''" + name + "''" + "\n" +
                    "amount of employees " + workers.size() + "\n" +
                    "income of company is " + getIncome() + "\n" +
                    "Top five height salary " + getTopSalaryStuff(5) + "\n" +
                    "Top five low salary" + getLowSalaryStuff(5);
        }
        int firedAmount;

    public void firePercentOfEmployees(int percent) {
        if (percent > 100) {
            percent = 100;
        } else if (percent < 0) {
            percent = 0;
        } else {
            firedAmount = (workers.size() / 100) * percent;

            Random random = new Random();
            List<Integer> randomIndices = new ArrayList<>();
            while (randomIndices.size() < firedAmount) {
                int randomIndex = random.nextInt(workers.size());
                if (!randomIndices.contains(randomIndex)) {
                    randomIndices.add(randomIndex);
                }
            }
            for ( int i < firedAmount -1; i >= 0; i++) {
                int indexToRemove = randomIndices.get(i);
                workers.remove(indexToRemove);
            }
        }
    }
}









