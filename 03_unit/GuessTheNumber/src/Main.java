import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    int value = 92;
    int attempt = 0;
    while (attempt != value){
        System.out.print("Enter the number:");
        attempt = new Scanner(System.in).nextInt();
        if (attempt > value){
            System.out.println("Hidden number is less");
        }
        else if (attempt < value){
            System.out.println("Hidden number is greater");
        }
    }
    if (attempt == value){
        System.out.println("You guessed!");
    }
    }
}
