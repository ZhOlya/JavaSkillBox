import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitText {




    public void splitText (String someText){ //раздел€ет текст по пробелу, предварительно заменив все, кроме букв  и пробела на пустышку
        String regex = "[^A-Za-z \n]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(someText);
        String newText = matcher.replaceAll(""); // паттерны, мачеры, херачеры. »«”„»“№!
        //System.out.println(newText);
        String [] words = newText.split("\s+");// деление нового текста по пробелу
        for(int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }

}
