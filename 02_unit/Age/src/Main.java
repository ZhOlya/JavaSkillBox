public class Main {
    public static void main(String[] args) {
//Напишите программу, которая выводит возрасты трёх людей в порядке увеличения
        int petyaAge = 6;
        int lenaAge = 90;
        int romaAge = 6;

        int min = -1;
        int middle = -1;
        int max = -1;

        if (petyaAge >= lenaAge && petyaAge >= romaAge){
            max = petyaAge;
            if ( lenaAge >= romaAge) {
                middle = lenaAge;
                min = romaAge;
            }
            else {
                middle = romaAge;
                min = lenaAge;
            }
            }

        if (lenaAge >= petyaAge && lenaAge >= romaAge){
            max = lenaAge;
            if ( petyaAge >= romaAge){
                middle = petyaAge;
                min = romaAge;
            }
            else {
                middle = romaAge;
                min = petyaAge;
            }
        }

        if (romaAge >= lenaAge && romaAge >= petyaAge){
            max = romaAge;
            if ( lenaAge >= petyaAge){
                middle = lenaAge;
                min = petyaAge;
            }
            else {
                middle = petyaAge;
                min = lenaAge;
            }
        }
        System.out.println( "Minimal age: " + min);
        System.out.println( "Middle age: " + middle);
        System.out.println( "Максимальный возраст: " + max);
        }
    }

