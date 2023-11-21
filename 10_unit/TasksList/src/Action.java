import java.util.ArrayList;

public class Action {
    static ArrayList<String> listTasks = new ArrayList<>();
    String firtWord = ""; // первое слово в заданной строке
    String task = ""; // текст задачи
    String index = ""; // Строка индекс, заданный пользователем
    int num; // номер индекса, заданного пользователем

    public void makeIndex() {
        if (!index.isEmpty()) {
            num = Integer.parseInt(index);
        }
    }


    public void action(String userTask) { //основной метод, который вызывается из main
        findParts(userTask);
        if (firtWord.equals("ADD")){
            add();
        } else if (firtWord.equals("LIST")){
            list();
        } else if (firtWord.equals("EDIT")){
            edit();
        } else if (firtWord.equals("DELETE")){
            remove();
        } else {
            System.out.println("Error. Please, use commands LIST, ADD, EDIT, DELETE ");
        }
    }

    public void findParts(String str) {//разделяем строку на первое слово(действие), индекс (если есть) и задачу
        String string = str + "  "; //Добавляем пробел в конец строки для поиска второго пробела при использовании 2 слов в строке
        int firstSpace = string.indexOf(' '); // поиск первого пробела
        int secondSpace = string.indexOf(' ', firstSpace + 1); // поиск второго пробела

        // System.out.println(firstSpace + " " + secondSpace);

        firtWord = string.substring(0, firstSpace); // Определяем первое слово(действие)
        //System.out.println(firtWord);
        String secondWord = string.substring(firstSpace + 1, secondSpace); // второе слово
        String regix = "[0-9]+";

        if (secondWord.matches(regix)) { //Определяем текст задачи в зависимости от того, является ли второе слово цифрой
            task = string.substring(secondSpace + 1);
            index = secondWord;
        } else {
            task = string.substring(firstSpace + 1);
        }
        // System.out.println(index + task);
    }

    public void add() {
        makeIndex();
        if (index.isEmpty() || num >= listTasks.size()) {
            listTasks.add(task);
        } else {
            listTasks.add(num, task);
        }
        System.out.println("Case added to the list: " + task);
    }

    public void list() {
        for (int i = 0; i < listTasks.size(); i++) {
            System.out.println(i + " - " + listTasks.get(i));
        }
    }

    public void edit() {
        makeIndex();
        if (index.isEmpty() || num >= listTasks.size()) {

        } else {
            listTasks.set(num, task);
        }
    }

    public void remove(){
        makeIndex();
        if (index.isEmpty() || num >= listTasks.size()) {

        } else {
            listTasks.remove(num);
        }
    }


}
