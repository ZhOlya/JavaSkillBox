import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       ArithmeticCalculator one = new ArithmeticCalculator();

       while (true) {
           System.out.println("please, enter the two numbers ");

           int z = new Scanner(System.in).nextInt();
           int v = new Scanner(System.in).nextInt();

           one.setX(z);
           one.setY(v);

           one.calculate(Operation.ADD);
           one.calculate(Operation.SUBTRACT);
           one.calculate(Operation.MULTIPLY);
       }
    }
}
