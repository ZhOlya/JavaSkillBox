import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Salary3 {
    String combainNum = "";

    public void salaryCalculate(String text) {
        String regix = "[0-9.]";
        Pattern pattern = Pattern.compile(regix);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            String num = text.substring(matcher.start(), matcher.end());
            combainNum = combainNum + num;
            System.out.println(combainNum);
//            for (int i = 0; i < text.length(); i++) {
//                char index = text.charAt(i);
//                if (Character.isLetter(index)) {
//                    combainNum = "";
//                }
//            }
        }
    }
}