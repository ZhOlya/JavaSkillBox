import java.util.ArrayList;
import java.util.List;

public class Salary4 {

    public void salaryCalculate(String firstText) {
        String regixSpace = "[\s]+";
        String text = firstText.replaceAll(regixSpace, "");
        System.out.println(text);
        ArrayList<String> numbers = new ArrayList<>();
        String temp = "";
        char preSymbol = ' ';
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if (Character.isDigit(symbol)) {
                temp += symbol;
            } else if (Character.isDigit(preSymbol)) {
                if (symbol == '.') {
                    temp += symbol;
                } else {
                    numbers.add(temp);
                    temp = "";
                }
            }
            if (i == text.length() - 1 && !temp.isEmpty()) {
                numbers.add(temp);
            }
            preSymbol = symbol;
        }
        System.out.println(numbers);
        double sum = 0;
        for (int x = 0; x < numbers.size(); x++) {
            sum += Double.parseDouble(numbers.get(x));
        }
        System.out.println(sum);
    }
}
