import java.util.*;

public class Numbers {
    static String[] litters = {"�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�", "�"};
    static ArrayList<String> littersList = new ArrayList<>(List.of(litters));

    static String[] number = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
    static ArrayList <String> numberList = new ArrayList<>(List.of(number));

    static ArrayList <String> region = new ArrayList<String>();

    HashSet <String> coolNumbers = new HashSet<>();


    static String tripleNumber = "";


// ���������� �����, ������� ����� � ������
    static void generateNumber (){
        Collections.shuffle(numberList);
        tripleNumber = numberList.get(0);
    }


    // ������� � ��������� ������� � ������ �� 01 �� 199
    static void generateRegion() {
        for (int i = 1; i < 200; i++) {
            String number = Integer.toString(i);
            if (number.length() == 1) {
                number = "0" + number;
            }
            region.add(number);
        }
    }

    // ������� ����������� ���������� �������� ������� � ��������� �� � HashSet
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

// �������� ����� � ��������������� ������
    public void searchBinaryInList(String searchedNumber){
        ArrayList <String> coolNumberList = new ArrayList<>(coolNumbers);
        Collections.sort(coolNumberList);
        System.out.println("��������������� ������: " + "\n" + coolNumberList);
        long startTime = System.nanoTime();
        int index = Collections.binarySearch(coolNumberList, searchedNumber);
        long finishTime = System.nanoTime();
        long searchingTime = finishTime - startTime;
        if ( index >= 0){
            System.out.println("����� �������� ������� � ��������������� ������. ����� ������. ��� ������: " + searchingTime + " ��");
        } else {
            System.out.println("����� �������� ������� � ��������������� ������. ����� �� ������. ��� ������: " + searchingTime + " ��");
        }
    }
//����� ��������� � ������
    public void searchLineInList(String searchedNumber){
        ArrayList <String> coolNumberList = new ArrayList<>(coolNumbers);
        long startTime = System.nanoTime();
        for (int i = 0; i < coolNumberList.size(); i++){
            if (coolNumberList.get(i).equals(searchedNumber)){
                long finishTime = System.nanoTime();
                long searchingTime = finishTime - startTime;
                System.out.println("����� ��������� � �����. ����� ������! ��� ������ " + searchingTime + "��");
            } else if (i == coolNumberList.size() - 1){
                long finishTimeSecond = System.nanoTime();
                long searchingTimeSecond = finishTimeSecond - startTime;
                System.out.println("����� ��������� � �����. ����� �� ������. ��� ������: " + searchingTimeSecond + " ��");
            }
        }

    }

    public void searchInHashSet(String searchedNumber){
        long startTime = System.nanoTime();
        if (coolNumbers.contains(searchedNumber)){
            long finishTime = System.nanoTime();
            long searchingTime = finishTime - startTime;
            System.out.println("����� � HashSet. ����� ������! ��� ������: " + searchingTime + " ��");
        } else {
            long finishTimeSecond = System.nanoTime();
            long searchingTimeSecond = finishTimeSecond - startTime;
            System.out.println("����� � HashSet. ����� �� ������. ��� ������: " + searchingTimeSecond + " ��");
        }

    }

    public void searchInTreeSet(String searchedNumber){
        TreeSet <String> coolNumberTree = new TreeSet<>(coolNumbers);
        long startTime = System.nanoTime();
        if (coolNumberTree.contains(searchedNumber)){
            long finishTime = System.nanoTime();
            long searchingTime = finishTime - startTime;
            System.out.println("����� � TreeSet. ����� ������! ��� ������: " + searchingTime + " ��");
        } else {
            long finishTimeSecond = System.nanoTime();
            long searchingTimeSecond = finishTimeSecond - startTime;
            System.out.println("����� � TreeSet. ����� �� ������. ��� ������: " + searchingTimeSecond + " ��");
        }

    }
}
