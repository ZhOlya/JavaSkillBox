import java.util.*;

public class Numbers {
    static String[] litters = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
    static ArrayList<String> littersList = new ArrayList<>(List.of(litters));

    static String[] number = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    static ArrayList <String> numberList = new ArrayList<>(List.of(number));

    static ArrayList <String> region = new ArrayList<String>();

    HashSet <String> coolNumbers = new HashSet<>();


    static String tripleNumber = "";


// Определяем цифру, которая будет в номере
    static void generateNumber (){
        Collections.shuffle(numberList);
        tripleNumber = numberList.get(0);
    }


    // создаем и добавляем регионы в список от 01 до 199
    static void generateRegion() {
        for (int i = 1; i < 200; i++) {
            String number = Integer.toString(i);
            if (number.length() == 1) {
                number = "0" + number;
            }
            region.add(number);
        }
    }

    // Создаем опредленное количесвто красивых номеров и добавляем их в HashSet
    public void generateCoolNumber(){
        generateRegion();
            for (int i = 0; ; i++){
                generateNumber();
                Collections.shuffle(littersList);
                Collections.shuffle(region);
                String coolNum = littersList.get(0) + tripleNumber + tripleNumber + tripleNumber + littersList.get(1) +
                        littersList.get(2) + region.get(0);
                coolNumbers.add(coolNum);
                if ( coolNumbers.size() == 10_000){
                    break;
                }
            }
        //System.out.println(coolNumbers.size());
        //System.out.println(coolNumbers);
    }

// Бинарный поиск в отсортированном списке
    public void searchBinaryInList(String searchedNumber){
        ArrayList <String> coolNumberList = new ArrayList<>(coolNumbers);
        Collections.sort(coolNumberList);
        System.out.println("Отсортированный список: " + "\n" + coolNumberList);
        long startTime = System.nanoTime();
        int index = Collections.binarySearch(coolNumberList, searchedNumber);
        long finishTime = System.nanoTime();
        long searchingTime = finishTime - startTime;
        if ( index >= 0){
            System.out.println("Поиск бинарным методом в отсортированном списке. Номер найден. Это заняло: " + searchingTime + " нс");
        } else {
            System.out.println("Поиск бинарным методом в отсортированном списке. Номер НЕ найден. Это заняло: " + searchingTime + " нс");
        }
    }
//поиск перебором в списке
    public void searchLineInList(String searchedNumber){
        ArrayList <String> coolNumberList = new ArrayList<>(coolNumbers);
        long startTime = System.nanoTime();
        for (int i = 0; i < coolNumberList.size(); i++){
            if (coolNumberList.get(i).equals(searchedNumber)){
                long finishTime = System.nanoTime();
                long searchingTime = finishTime - startTime;
                System.out.println("Поиск перебором в листе. Номер найден! Это заняло " + searchingTime + "нс");
            } else if (i == coolNumberList.size() - 1){
                long finishTimeSecond = System.nanoTime();
                long searchingTimeSecond = finishTimeSecond - startTime;
                System.out.println("Поиск перебором в листе. Номер НЕ найден. Это заняло: " + searchingTimeSecond + " нс");
            }
        }

    }

    public void searchInHashSet(String searchedNumber){
        long startTime = System.nanoTime();
        if (coolNumbers.contains(searchedNumber)){
            long finishTime = System.nanoTime();
            long searchingTime = finishTime - startTime;
            System.out.println("Поиск в HashSet. Номер найден! Это заняло: " + searchingTime + " нс");
        } else {
            long finishTimeSecond = System.nanoTime();
            long searchingTimeSecond = finishTimeSecond - startTime;
            System.out.println("Поиск в HashSet. Номер НЕ найден. Это заняло: " + searchingTimeSecond + " нс");
        }

    }

    public void searchInTreeSet(String searchedNumber){
        TreeSet <String> coolNumberTree = new TreeSet<>(coolNumbers);
        long startTime = System.nanoTime();
        if (coolNumberTree.contains(searchedNumber)){
            long finishTime = System.nanoTime();
            long searchingTime = finishTime - startTime;
            System.out.println("Поиск в TreeSet. Номер найден! Это заняло: " + searchingTime + " нс");
        } else {
            long finishTimeSecond = System.nanoTime();
            long searchingTimeSecond = finishTimeSecond - startTime;
            System.out.println("Поиск в TreeSet. Номер НЕ найден. Это заняло: " + searchingTimeSecond + " нс");
        }

    }
}
