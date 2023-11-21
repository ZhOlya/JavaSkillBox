import java.util.ArrayList;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> numbers = new ArrayList<>();
        TreeMap<String, String> phoneBook = new TreeMap<>();

        phoneBook.put("masha", "000");
        phoneBook.put("petya", "999");
        phoneBook.put("masha", "555");

        System.out.println(phoneBook);

    }
}
