/*�������� ����� Printer � ���������� � ��:

���������� String queue, � ������� ����� ��������� ������
���������� �� ������ (�������� ����).
��������� ������� append, ����������� ��������� (������� � �� ������).
+��������� �������� ����������: ����� ���������, ��� ���������,
 ���������� �������.
+������������ ���������� �������� ������ ����� ���������, �������
 ���������� ������� ��� ������, ����������� ����, ��� ��� ��� ���������.
��� ���������� ���������� ��� ������ ����������� � ������
String queue � ���������� ����, ��� ���� �������� ������ Basket.
+����� clear, ��������� ������� ������ (������ String queue).
+����� print, ��������� ��� ���������� � ����������� � �������
���������� � �������  � ��������� ������� ������ ����� �����.

����� getPendingPagesCount, ������������ ����� ���������� �������,
 ������� ��������� � �������, �� ��� �� �����������, � ����� ���������������
 ����������, � ������� ����� ��������� ��� ����������.
???�����, ������������ ����� ���������� ������������� ������� �� �� �����
������������� ������� ������ Printer. ��� ������ ���������� ��������������.

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