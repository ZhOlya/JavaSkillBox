/*Создайте класс Printer и реализуйте в нём:

Переменную String queue, в которой будет храниться список
документов на печать (смотрите ниже).
Несколько методов append, принимающих документы (условно — на печать).
+Возможные свойства документов: текст документа, имя документа,
 количество страниц.
+Обязательным параметром является только текст документа, поэтому
 необходимо создать три метода, принимающих один, два или три параметра.
При добавлении документов они должны добавляться в строку
String queue — аналогично тому, как было сделанов классе Basket.
+Метод clear, очищающий очередь печати (строку String queue).
+Метод print, выводящий всю информацию о добавленных в принтер
документах в консоль  и очищающий очередь печати после этого.

Метод getPendingPagesCount, возвращающий общее количество страниц,
 которые добавлены в принтер, но ещё не распечатаны, а также соответствующую
 переменную, в которой будет храниться это количество.
???Метод, возвращающий общее количество распечатанных страниц за всё время
существования объекта класса Printer. Имя метода придумайте самостоятельно.

public class Printer {
    private static String queue = "";
    int PendingPageCount = 0;

    public static void append (String text){
        append(text, "");
    }
    public static void append (String text, String name){
        append(text, name, 1);
    }
    public static void append (String text, String name, int count){
        queue = "\n" + text + name + count + "page";

    }

    public static void clear(){
        queue = "";
    }

    public static void print(String printList){
        System.out.println(printList);
        if(queue.isEmpty()){
            System.out.println("Print list: empty");
        }
        else {
            System.out.println(queue);
        }
    }
}
*/