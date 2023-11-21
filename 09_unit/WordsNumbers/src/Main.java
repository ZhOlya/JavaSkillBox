//Нужно написать метод sequentialWordsNumbers, который в качестве аргумента принимает текст
// и перед каждым словом пишет его порядковый номер в круглых скобках и возвращает строку.
// Метод необходимо написать без использования регулярных выражений.
// For example : Введите текст:
//Это просто текст, для примера работы программы
//Результат:
//(1) Это (2) просто (3) текст,  для (5) примера (6) работы (7) программы
//Советы и рекомендации
//
//Используйте поиск пробелов в тексте методом indexOf в цикле.
//Сохраняйте новую строку в объект класса StringBuilder, а затем верните объект класса String

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Operation words = new Operation();
////        System.out.println("Enter the text, please.");
////        String enterText = new Scanner(System.in).nextLine();
        words.setText("Просто фраза для проверки кода");

        words.sequentialWordsNumbers();
        System.out.println(words);



    }

}
