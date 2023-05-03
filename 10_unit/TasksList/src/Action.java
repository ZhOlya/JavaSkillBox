import java.util.ArrayList;

public class Action {
    static ArrayList <String> listTasks = new ArrayList<>();
    String firtWord = ""; // ������ ����� � �������� ������
    String task = ""; // ����� ������
    String index; // ������, �������� �������������

    public void action (String userTask){ //�������� �����, ������� ���������� �� main
        findParts(userTask);
        add();
        list();
    }

    public void findParts (String str) {//��������� ������ �� ������ �����(��������), ������ (���� ����) � ������
        String string = str + " "; //��������� ������ � ����� ������ ��� ������ ������� ������� ��� ������������� 2 ���� � ������
        int firstSpace = string.indexOf(' '); // ����� ������� �������
        int secondSpace = string.indexOf(' ', firstSpace + 1); // ����� ������� �������

       // System.out.println(firstSpace + " " + secondSpace);

        firtWord = string.substring(0, firstSpace); // ���������� ������ �����(��������)
        //System.out.println(firtWord);
        String secondWord = string.substring(firstSpace + 1, secondSpace); // ������ �����
        String regix = "[0-9]+";

        if (secondWord.matches(regix)){ //���������� ����� ������ � ����������� �� ����, �������� �� ������ ����� ������
            task = string.substring(secondSpace + 1);
            index = secondWord;
        } else {
            task = string.substring(firstSpace + 1);
        }
       // System.out.println(index + task);
    }


    public void add(){
        listTasks.add(task);
        System.out.println("Case added to the list: " + task);
    }

    public void list(){
        for (int i = 0; i < listTasks.size(); i++){
            System.out.println(i + " - " + listTasks.get(i));
        }
    }


}
