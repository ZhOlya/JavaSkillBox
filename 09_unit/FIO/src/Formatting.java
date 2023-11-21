import java.util.ArrayList;
import java.util.StringTokenizer;

public class Formatting {


    public void remake (String nameBefore){
        ArrayList <String> fullName= new ArrayList<>();
        String word = "";
        String name = nameBefore.trim();
        for ( int i = 0; i < name.length(); i++){
            //System.out.println(indexSpace);
            word += name.charAt(i);
            if (name.charAt(i) == ' ' || i == name.length()-1){
                //System.out.println(word);
                fullName.add(word);
                word = "";
            }
        }
        if (fullName.size() == 3) {
            //System.out.println(fullName);
            System.out.println("Имя: " + fullName.get(0) + "\n" +
                    "Фамилия: " + fullName.get(1) + "\n" +
                    "Отчество: " + fullName.get(2));
        } else {
            System.out.println("Введенная строка не является ФИО");
        }
    }
}
