public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.


//        for(char symbol = 'А'; symbol <= 'я'; symbol ++){
//            int numb = symbol;
//            System.out.println(symbol + " - " + numb);
//        }
//        System.out.println("Ё" + " - " +(int)'Ё');
//        System.out.println("ё" + " - " + (int)'ё');

        int x = 4;
        int y =x++;
        System.out.println(y);

    }
}
