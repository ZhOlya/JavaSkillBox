import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Напишите программу, которая будет находить все пары положительных целых чисел,
        произведение которых будет равно значению value. Например, если ввести число 6
        программа должна выдать следующий результат: 1*6 2*3 3*2 6*1
        */
        int value = new Scanner(System.in).nextInt();

        for (int x = 1; x <= value;x++){
            for (int y = 1; y <= value; y++) {
                if (x * y == value){
                    System.out.println(x + "*" + y);
                }

            }

        }
    }
}
