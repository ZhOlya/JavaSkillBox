import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // калькулятор факториала
        {
            System.out.println("Enter the number");
        };

        int value = new Scanner(System.in).nextInt();

        int fac = 1;

        for ( int f = 1; f <= value; f++){
           fac = fac * f;
        }
        System.out.println(value + "! = " + fac);
    }
}
