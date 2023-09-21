import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

//        private Date generateRandomDate() {
//            long currentTime = System.currentTimeMillis();
//            long randomTime = currentTime + (long)((this.random.nextDouble() - 0.5D) * 2.0D * 8.64E7D);
//            return new Date(randomTime);
//        }
        long now = System.currentTimeMillis();
        long newTime = now + (2 * 60 * 60 * 1000);
        Date currentTime = new Date(now);
        Date tt = new Date(newTime);


//        LocalDate dateWithTwo
        System.out.println(currentTime + "\n" + tt);



    }
}
