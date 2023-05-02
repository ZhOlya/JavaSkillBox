import java.util.Arrays;

public class ReverseArray {
    public void reverse(String [] arr){
        String [] reverseLetters = new String [arr.length];
        int index = 0;
        for ( int i = arr.length - 1; i >= 0; i--){
            reverseLetters[index++] = arr[i];
        }
        System.out.println(Arrays.toString(arr) + "\n" + Arrays.toString(reverseLetters));

    }

}
