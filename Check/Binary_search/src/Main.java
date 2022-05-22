import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Search search = new Search();

        while (true){
            System.out.println("Please, enter the number");
            int x = new Scanner(System.in).nextInt();
            search.searchTheNumber(x);
        }
    }
}
