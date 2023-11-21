import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneBook {
    //String text = "";
    String name = "";
    String number = "";

    String regixNum = "[0-9]+";
    String regixLet = "[�-��-�A-Za-z -]+";

    static TreeMap <String, String> phoneNote = new TreeMap<>();
    ArrayList<String> value = new ArrayList<>(phoneNote.values());


    public void start(String fromUser){ //��������� �����, ���������� �������� �� ������ ������� ��� �� �������� � ����������
        if (fromUser.equalsIgnoreCase("LIST")) {
        toList();
        } else {
            defineText(fromUser);
        }
    }


    private void defineText(String fromUser){ //���������� �������� �� ����� ������ ��� ������� � � ����������� �� ����� ���������� ���������� �������
        String one = fromUser.trim();//Delete a space in start and end sentence
        if (one.matches(regixLet)){ // ���� ��������� ������ �������� ������ (key)
            name = one;
            if (phoneNote.containsKey(name)){ // ���� ��� ��� ����������, �� ������� ������ �������
                System.out.println("This name is already recorded: " + "\n" + name + " - " + phoneNote.get(name));
            }
            else {
                enterNumber();// ���� ����� ���, �� ������ ������ �����
            }
        } else if (one.matches(regixNum)){//���� ��������� ������ �������� ������
            number = one;
            searchSubstring();


        }else {
            System.out.println("Invalid input format. Try again.");
        }

    }

    public void searchSubstring(){//����� ��������� � ������� ������
        if (value.contains(number)){
//        for (String str : value) {
//            if (str.contains(number)) { //���� ���������� �����, �� ���������� ����� ��� ��������� ����� ����� ������
                System.out.println("This number is already recorded:");
                getKeyByValue(number);
//            }
//        }
        } else { // ���� ����� �����, �� ������ ������ ���
            enterName();
        }
    }

    public void enterNumber(){ // ���������� ����� � ���������� �����
        System.out.println("Enter the phone number");
        String num = new Scanner(System.in).nextLine();
        if (!num.matches(regixNum)){ // �������� �������� �� ������
            System.out.println("Invalid input format. Try again.");
        } else {
            number = num;
            addNamePhone();
        }
    }

    public void enterName(){ //���������� ��� � ���������� ������
        System.out.println("Enter the name");
        String nam = new Scanner(System.in).nextLine();
        if (!nam.matches(regixLet)){
            System.out.println("Invalid input format. Try again.");
        } else {
            if (!phoneNote.containsKey(nam)) {// ���� ��� �� ����������
                name = nam;
                addNamePhone();
            } else { // ���� ��� ����������
                System.out.println("This name already exists. Contact updated.");
                name = nam;
                updateContact();

            }
        }
    }

    public void updateContact (){
        String value = phoneNote.get(name);
        String newValue = value + ", " + number;
        phoneNote.put(name, newValue);
        this.value.add(number);
    }

    public void addNamePhone(){ //������� ����� ������� (��� + �����)
        phoneNote.put(name, number);
        value.add(number);
        System.out.println("Contact saved" + ": " + name + " - " + number);
    }

    public void toList(){ //������� ���� ������ ���������
        if (phoneNote.isEmpty()){
            System.out.println("List of contacts is empty");
        }else {
            for (Map.Entry <String, String> entry : phoneNote.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        }
    }

    public void getKeyByValue(String smth){ //�����, ������� ������� ���� (���) �� �������� (������)
        for (Map.Entry<String, String> key : phoneNote.entrySet()){
            if (key.getValue().equals(smth)){
                System.out.println(key.getKey() +" - " + key.getValue());
            }
        }
    }
}
