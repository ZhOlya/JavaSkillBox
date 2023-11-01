import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CustomerStorage {
    private final Map<String, Customer> storage;

    public CustomerStorage() {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) throws IllegalArgumentException {
        final int INDEX_NAME = 0;
        final int INDEX_SURNAME = 1;
        final int INDEX_EMAIL = 2;
        final int INDEX_PHONE = 3;


            String[] components = data.split("\\s+");
                checkInputFormat(components);

                String name = components[INDEX_NAME] + " " + components[INDEX_SURNAME];
                storage.put(name, new Customer(name, components[INDEX_PHONE], components[INDEX_EMAIL]));

    }

    private void checkInputFormat (String [] components) throws IllegalArgumentException {
//        ArrayList <String> errorsList = new ArrayList<>();
        String regexEmail = "^[\\w.-]+@[\\w.-]+\\.[\\w-]{2,4}$";
        String regexPhoneNumber ="^(\\+7|8)\\d{10}$";

        if (components.length != 4 ){
            System.out.println("Its works");
//            errorsList.add("Invalid input elements of string. Number of elements - " + components.length);
            throw new IllegalArgumentException("Invalid input elements of string. Number of elements - " + components.length);
        } else if (!components[2].matches(regexEmail)){
            System.out.println(components[2]);
//            errorsList.add("Invalid input email: " + components[2] );
            throw new IllegalArgumentException("Invalid input email: " + components[2]);
        } else if (!components[3].matches(regexPhoneNumber)){
//          errorsList.add("Invalid input phone number: " + components[3]);
          throw new IllegalArgumentException("Invalid inpet phone number: " + components[3] +
                  "\n" + "The number must have 11 characters. Try use form: +7xxxxxxxxxx or 8xxxxxxxxxx ");
        }

    }




    public void listCustomers() {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name) {
        storage.remove(name);
    }

    public Customer getCustomer(String name) {
        return storage.get(name);
    }

    public int getCount() {
        return storage.size();
    }
}