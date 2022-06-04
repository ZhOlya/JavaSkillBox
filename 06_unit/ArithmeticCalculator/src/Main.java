import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       ArithmeticCalculator one = new ArithmeticCalculator();

       while (true) {
           System.out.println("please, enter the two numbers ");

           double z = new Scanner(System.in).nextDouble();
           double v = new Scanner(System.in).nextDouble();

           one.setX(z);
           one.setY(v);

           one.calculate(Operation.ADD);
           one.calculate(Operation.SUBTRACT);
           one.calculate(Operation.MULTIPLY);
           one.calculate(Operation.DIVISION);
           System.out.println("");
       }
    }
}
