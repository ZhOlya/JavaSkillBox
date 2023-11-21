import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       System.out.println("¬ведите количество €щиков");
       int box = new Scanner(System.in).nextInt();

        Cargo cargo = new Cargo();
        cargo.setBox(box);
        cargo.result();
        cargo.numbering();

    }
}
