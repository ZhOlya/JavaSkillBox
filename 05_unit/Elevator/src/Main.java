import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(-3, 26);

        while(true) {
            System.out.print("¬ведите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            if (floor == 252585) {
                System.out.println("Elevator is off");
                break;
            }
            elevator.move(floor);
        }
    }
}

