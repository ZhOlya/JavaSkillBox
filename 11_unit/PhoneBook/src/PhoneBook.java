import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PhoneBook {
    String text = "";
    String name = "";
    String number = "";
    String regixNum = "[0-9]+";
    String regixLet = "[A-Za-z -]+";

    static TreeMap <String, String> phoneNote = new TreeMap<>();

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

//    public PhoneBook(String text) {
//        this.text = text;
//    }

    public void start(String fromUser){
        defineText(fromUser);
    }

    public void defineText(String one){ //Определяем является ли текст именем или номером
        one.trim();//Delete a space in start and end sentence
        if (one.matches(regixLet)){
            name = one;
            enterNumber();
//            System.out.println("Name " + name);
        } else if (one.matches(regixNum)){
            number = one;
            enterName();
//            System.out.println("Number " + number);
        }else {
            System.out.println("Invalid input format. Try again.");
        }
//        int space = one.indexOf(' ');
//        firstWord = one.substring(0, space);
//        secondWord = one.substring(space + 1);
//        //System.out.println(firstWord + "\n" + secondWord); Этот метод работает
    }

    public void enterNumber(){
        System.out.println("Enter the phone number");
        String num = new Scanner(System.in).nextLine();
        if (!num.matches(regixNum)){ // проверка является ли числом
            System.out.println("Invalid input format. Try again.");
        } else {
            number = num;
            addNamePhone();
        }
    }

    public void enterName(){
        System.out.println("Enter the name");
        String nam = new Scanner(System.in).nextLine();
        if (!nam.matches(regixLet)){
            System.out.println("Invalid input format. Try again.");
        } else {
            name = nam;
            addNamePhone();
        }
    }

    public void addNamePhone(){
        phoneNote.put(name, number);
        System.out.println("Contact saved" + " " + name + " " + number);
    }

//    public void add(){
//
////        System.out.println(firstWord + "\n" + secondWord);
////        if (firstWord.matches(regixNum)){
////            phoneNote.put(firstWord, secondWord);
////            System.out.println("Contact added");
////        } else if (firstWord.matches(regixLet)){
////            phoneNote.put(secondWord, firstWord);
////            System.out.println("Contact added");
////        } else {
////            System.out.println("Error!");
////        }
//    }

    public void toList(){
        for (Map.Entry <String, String> entry : phoneNote.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
