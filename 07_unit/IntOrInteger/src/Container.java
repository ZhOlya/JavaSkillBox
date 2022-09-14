public class Container {
    //private Integer count; Изначальный код
    private Integer count = 0;// Мое исправление, с которым все работает

    public void addCount(int value) {
        count = count + value;
    }

    public int getCount() {
        return count;
    }
}

/*
Задание 1
Запустите код проекта IntOrInteger, найдите ошибку и исправьте класс Container таким образом,
 чтобы ошибка не возникала.

 Задание 2
Напишите в этом же проекте код, который с помощью цикла и преобразования чисел в символы найдё
т все числовые коды букв русского алфавита — заглавных и строчных, в том числе буквы Ё.
 */
