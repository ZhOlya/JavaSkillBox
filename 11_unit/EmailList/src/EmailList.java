import java.util.HashSet;

public class EmailList {
    static HashSet<String> emailList = new HashSet<>();

    String regix = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$"; //������ ����������� �����
    String firstWord = "";
    String email = "";

    public void start(String stringFromUsre) {
        String[] words = stringFromUsre.split("\\s+"); //��������� ������ �� �����

        if (words.length == 2 && words[0].equals("ADD")) {
            stringFromUsre.trim(); // ����������� �� ������ �������� � ������ � � �����, ���� ����
            int space = stringFromUsre.indexOf(" ", 0);// ���������� ������ ����� � ��� mail
            firstWord = stringFromUsre.substring(0, space);
            email = stringFromUsre.substring(space + 1);
            addEmail(stringFromUsre);
        } else if (words.length == 1 && words[0].equals("LIST")) {
            toList();
        } else {
            System.out.println("Error");
        }

    }

    public void addEmail(String n) { //��������� �����, ���� ������� ��� ������
        if (email.matches(regix)) {
            emailList.add(email);
            System.out.println("email is added");
        } else {
            System.out.println("Entered email is w" +
                    "rong!");
        }
    }


    public void toList() {
        for (String email : emailList) {
            System.out.println(email);
        }
    }
}
