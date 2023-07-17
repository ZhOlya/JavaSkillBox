import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneBook {
    //String text = "";
    String name = "";
    String number = "";

    String regixNum = "[0-9]+";
    String regixLet = "[А-Яа-яA-Za-z -]+";

    static TreeMap <String, String> phoneNote = new TreeMap<>();
    ArrayList<String> value = new ArrayList<>(phoneNote.values());


    public void start(String fromUser){ //Стартовый метод, определяет выводить ли список целиком или же работать с контактами
        if (fromUser.equalsIgnoreCase("LIST")) {
        toList();
        } else {
            defineText(fromUser);
        }
    }


    private void defineText(String fromUser){ //Определяем является ли текст именем или номером и в зависимости от этого определяем дальнейшую тактику
        String one = fromUser.trim();//Delete a space in start and end sentence
        if (one.matches(regixLet)){ // Если введенная строка является именем (key)
            name = one;
            if (phoneNote.containsKey(name)){ // Если Имя уже существует, то выводит полный контакт
                System.out.println("This name is already recorded: " + "\n" + name + " - " + phoneNote.get(name));
            }
            else {
                enterNumber();// Если новое имя, то просит ввести номер
            }
        } else if (one.matches(regixNum)){//Если введенная строка является числом
            number = one;
            searchSubstring();


        }else {
            System.out.println("Invalid input format. Try again.");
        }

    }

    public void searchSubstring(){//Поиск подстроки в строках Списка
        if (value.contains(number)){
//        for (String str : value) {
//            if (str.contains(number)) { //Если существует номер, то вызывается метод для получения имени этого номера
                System.out.println("This number is already recorded:");
                getKeyByValue(number);
//            }
//        }
        } else { // Если новый номер, то просит ввести имя
            enterName();
        }
    }

    public void enterNumber(){ // определяет номер к введенному имени
        System.out.println("Enter the phone number");
        String num = new Scanner(System.in).nextLine();
        if (!num.matches(regixNum)){ // проверка является ли числом
            System.out.println("Invalid input format. Try again.");
        } else {
            number = num;
            addNamePhone();
        }
    }

    public void enterName(){ //определяет имя к введенному номеру
        System.out.println("Enter the name");
        String nam = new Scanner(System.in).nextLine();
        if (!nam.matches(regixLet)){
            System.out.println("Invalid input format. Try again.");
        } else {
            if (!phoneNote.containsKey(nam)) {// Если имя не существует
                name = nam;
                addNamePhone();
            } else { // Если имя существует
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

    public void addNamePhone(){ //Добляет новый контакт (Имя + номер)
        phoneNote.put(name, number);
        value.add(number);
        System.out.println("Contact saved" + ": " + name + " - " + number);
    }

    public void toList(){ //выводит весь список контактов
        if (phoneNote.isEmpty()){
            System.out.println("List of contacts is empty");
        }else {
            for (Map.Entry <String, String> entry : phoneNote.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        }
    }

    public void getKeyByValue(String smth){ //Метод, который находит ключ (Имя) по значению (номеру)
        for (Map.Entry<String, String> key : phoneNote.entrySet()){
            if (key.getValue().equals(smth)){
                System.out.println(key.getKey() +" - " + key.getValue());
            }
        }
    }
}
