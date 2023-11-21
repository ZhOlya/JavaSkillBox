import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate birhday = LocalDate.of(1993, 07, 19);
        int i = 0;

        while (birhday.isBefore(today)){
            System.out.println(i + "-" + birhday + " " + birhday.getDayOfWeek());
            birhday = birhday.plusYears(1);
            i++;

        }

        }


    }
