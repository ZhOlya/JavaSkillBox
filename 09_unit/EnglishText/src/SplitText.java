import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitText {




    public void splitText (String someText){ //��������� ����� �� �������, �������������� ������� ���, ����� ����  � ������� �� ��������
        String regex = "[^A-Za-z \n]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(someText);
        String newText = matcher.replaceAll(""); // ��������, ������, ��������. �������!
        //System.out.println(newText);
        String [] words = newText.split("\s+");// ������� ������ ������ �� �������
        for(int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }
    }

}
