import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Formatting2 {

    public void remark(String text){
        String newText = text.trim();
        String regix = "[А-Яа-я\s\\-]+";
        int indexSpace = 0;
//        Pattern pattern = Pattern.compile(rexig);
//        Matcher matcher = pattern.matcher(newText);
//        String remake = matcher.replaceAll("R");
//        System.out.println(remake);
        for (int i = 0; i < newText.length(); i++){ //Определяем количество пробелов в строке (их должно быть два)
            if(newText.charAt(i) == ' '){
                indexSpace++;
            }
        }

        if (newText.matches(regix) && indexSpace == 2){
            int spaceOne = newText.indexOf(' ');
            int spaceTwo = newText.lastIndexOf(' ');
            String surname = newText.substring(0,spaceOne);
            String name = newText.substring(spaceOne + 1, spaceTwo);
            String lastname = newText.substring(spaceTwo + 1);
            System.out.println("Фамилия: " + surname + "\n" +
                    "Имя: " + name + "\n" +
                    "Отчество: " + lastname);
        } else {
            System.out.println("Введенные данные не являеются ФИО");
        }
    }
}
