public class Search {

    int [] array = {};

    int searchNumber;
    int low = 0;
    int high = array.length - 1; //why -1?

    public  void search(int searchNumber){
        while (low <= high ){
            int mid = (low + high) / 2;
            if(searchNumber == array[mid]){
                searchNumber = mid;
                return;
            } else if (searchNumber < array[mid]){
                high = mid -1;
            } else if (searchNumber > array[mid]){
                low = mid + 1;
            }
        }
    }
}
