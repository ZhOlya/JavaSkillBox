import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arrayTest = new int[] {70, 67, 45, 33, 22, 65, 24, 87, 1, 76, 13, 98, 96, 56};
        int [] testArray = new int [] {1, 3, 1, 55, 32, 55, 1, 67, 34, 34, 67, 33, 55, 89, 3, 54, 67};
        System.out.println("������ ��������������: ");
        printArray(arrayTest);

        //sortBubble(arrayTest);
       // sortChoice(arrayTest);
        //sortFast(arrayTest, 0, arrayTest.length - 1);
        //mergeSort(arrayTest);
        //countSort(testArray);
        System.out.println("����������: ");
        //insertSort(arrayTest);
        sortComb(arrayTest);

        //System.out.println(Arrays.toString(arrayTest));

    }

    public static void sortComb(int[] array) {
        boolean isSorted = false;
        int gap = array.length; //���������� �������� ��������

        while (!isSorted || gap != 1) {

            if(gap > 1) {
                gap = gap  * 10 / 13;//������ �� ���������, ������ �������� ���������
            } else {
                gap = 1;
            }
            isSorted = true;
            for (int i = gap; i < array.length; i++) {
                if (array[i - gap] > array[i]) { //��������� �������� � ��������� ���������
                    int temp = array[i];
                    array[i] = array[i - gap];
                    array[i - gap] = temp;
                    isSorted = false;
                }
            }
            printArray(array);
        }
    }

    //���������� ��������
    public static void insertSort(int [] arr){
        for (int i = 1; i < arr.length ; i++) {
            int current = arr[i];//������� �������
            int j = i;
            while (j > 0 && arr[j - 1] > current){// ���� �� ��������������� ������������������
                // �������� �������� ���� ���� �� ������ �� ������ ������� ���� ���� ������� � �������� j-1 ����� ��������
                arr[j] = arr[j - 1];// �����
                j--;
            }
            arr[j] = current;
        }
    }


    //���������� ���������
    public static void countSort(int [] arr){
        final int MAX_VALUE = 100; // ���������� �������� �������� � �����

        int [] count = new int [MAX_VALUE];// ������� ������ ������� �������� � ���� ��������
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]] = count[arr[i] ] + 1; // ����������� ������� ������� �����, ����� ��� �����������
        }
        int arrayIndex = 0; //������� ������� � �������������� �������
        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {//��������� ������ ������ ������� ���, ������� �� ���� � ��������
                arr[arrayIndex] = i;
                arrayIndex++;
            }
        }
    }

    //����� ���������� � �������� �������
    public static int [] mergeSort (int[] arr){
        int [] temp;
        int [] currentSub = arr;
        int [] currentDest = new int[arr.length];

        int size = 1; //������ �������� �����������
        while (size < arr.length){//���� ������ ���������� ������ ������������ �������
            for (int i = 0; i < arr.length; i += 2 * size) {
                merge(currentSub, i, currentSub, i+size, currentDest, i, size);
            }

            temp = currentSub;
            currentSub = currentDest;
            currentDest = temp;
            size = size * 2; //������ ���������� ������������� � ��� ����

            System.out.println(arrayToString(currentSub));
        }
        return currentSub;
    }
    //����� �������
    private static void merge (int [] subOne, int subOneStart, int [] subTwo, int subTwoStart,
                               int [] dest, int destStart, int size){
        int index1 = subOneStart;
        int index2 = subTwoStart;
        //���������� ����� ����������� � ������ ������� ������� � ������� ��� ���������
        int subOneEnd = Math.min(subOneStart + size, subOne.length);
        int subTwoEnd = Math.min(subTwoStart + size, subTwo.length);
        //����������� ���������� �������� �����, ��� �� ���������� ��� ���������� (���������
        // ���������� ��������� ����� �����������)
        int iterationCount = subOneEnd - subOneStart + subTwoEnd - subTwoStart;
        for ( int i = destStart; i < destStart + iterationCount; i++){
            if (index1 < subOneEnd && (index2 >= subTwoEnd || subOne[index1] < subTwo[index2])){
                dest [i] = subOne [index1];
                index1++;
            } else {
                dest[i] = subTwo[index2];
                index2++;
            }
        }
    }




    //SORT FAST, PARTITION, SWAp, PRINTSortStep
    private static void sortFast(int [] arr, int from, int to){
        if (from < to){
            int divideIndex = partition(arr, from, to);
            printSortStep(arr, from, to, divideIndex);
            sortFast(arr, from, divideIndex - 1);
            sortFast(arr, divideIndex, to);
        }
    }
    private static int partition (int [] arr, int from, int to){
        int rightIndex = to;
        int leftIndex = from;

        int pivot = arr[from];
        while (leftIndex <= rightIndex){
            while (arr[leftIndex] < pivot){
                leftIndex++;
            }
            while (arr[rightIndex] > pivot){
                rightIndex--;
            }
            if (leftIndex <= rightIndex){
                swap(arr, rightIndex, leftIndex);
                leftIndex++;
                rightIndex--;
            }
        }
        return  leftIndex;
    }
    private  static void swap (int [] arr, int indexOne, int indexTwo){
        int temp = arr [indexOne];
        arr[indexOne] = arr [indexTwo];
        arr[indexTwo] = temp;
    }
    private static void printSortStep (int [] arr, int from, int to, int partitionIndex){
        System.out.println( "\n" + arrayToString(arr));
        System.out.print("partition at Index: " + partitionIndex);
        System.out.print(", left: " + arrayToString(Arrays.copyOfRange(arr, from, partitionIndex)));
        System.out.println(" right: " + arrayToString(Arrays.copyOfRange(arr, partitionIndex, to+1 )));
    }



//���������� �������
    private static void sortChoice (int [] arr){
        System.out.println("���������� �������: ");
        for (int step = 0; step < arr.length; step ++){
            int index = min(arr, step);
            int temp = arr[step];
            arr[step] = arr[index];
            arr[index] = temp;
            printArray(arr);
        }
    }
    private static int min (int [] arr, int start){
        int minIndex = start;
        int minValue = arr[start];
        for (int i = start + 1; i < arr.length; i++){
            if (arr[i] < minValue){
                minValue = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }



    public static void twister(int a, int b) {
        a = b;
        b = a;
        a = a;
        System.out.println(a + ", " + b);
    }

    //��������� ���������
    public static void sortBubble(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    int temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    isSorted = false;
                }
            }
            printArray(array);
        }
    }


        private static void printArray ( int[] arr ){
            System.out.print("[");
            for (int i = 0; i < arr.length; i++) {
                if (i > 0) {
                    System.out.print(",");
                }
                System.out.print(arr[i]);
            }
            System.out.println("]");
        }

        private static String arrayToString (int [] arr){
        StringBuilder sb = new StringBuilder();
        sb.append ("|");
        for (int i = 0; i < arr.length; i++){
            if (i > 0){
                sb.append(", ");
            }
            sb.append(arr[i]);
        }
        sb.append("| ");
        return sb.toString();
        }
    }

