import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    String text = "";
    String firstWord = "";
    String secondWord = "";
    String regixNum = "[0-9]+";
    String regixLet = "[A-Za-z]+";

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
        splitText(fromUser);
        add();
        toList();
    }

    public void splitText (String one){
        one.trim();//Delete a space in start and end sentence
        int space = one.indexOf(' ');
        firstWord = one.substring(0, space);
        secondWord = one.substring(space + 1);
        //System.out.println(firstWord + "\n" + secondWord); Этот метод работает
    }

    public void add(){
        System.out.println(firstWord + "\n" + secondWord);
        if (firstWord.matches(regixNum)){
            phoneNote.put(firstWord, secondWord);
            System.out.println("Contact added");
        } else if (firstWord.matches(regixLet)){
            phoneNote.put(secondWord, firstWord);
            System.out.println("Contact added");
        } else {
            System.out.println("Error!");
        }
    }

    public void toList(){
        for (Map.Entry <String, String> entry : phoneNote.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
