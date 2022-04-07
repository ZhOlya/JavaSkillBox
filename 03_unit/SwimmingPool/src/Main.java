public class Main {
    public static void main(String[] args) {

        int volume = 1200; // litres
        int fillingSpeed = 30; // litres per minute
        int devastionSpeed = 10; // litres per minute

        int V = 0;
        int min = 0;
        while (V != volume){
            V += fillingSpeed - devastionSpeed;
            min++;
            if (V == volume){
                break;
            }
            System.out.println(min);

        }
        
    }
}
