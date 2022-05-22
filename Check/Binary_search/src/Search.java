public class Search {

    int [] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,
            15,16,17,18,19,20,21,22,23,24};

    int low = 0;
    int high = array.length - 1; //why -1?

    public  void searchTheNumber(int number){
        while (low <= high ){
            int mid = (low + high) / 2;
            if(number == array[mid]){
                System.out.println("Position of your number: " + mid);
                break;
            } else if (number < array[mid]){
                high = mid -1;
            } else if (number > array[mid]){
                low = mid + 1;
            }
        }
    }
}
