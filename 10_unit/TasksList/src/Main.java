import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("You can use LIST, ADD, EDIT, DELETE.");
        while (true){
            System.out.println("What do you want to do?");
            String string = new Scanner(System.in).nextLine();
            //System.out.println(string);
            Action stringTask = new Action();
            stringTask.action(string);
        }
    }
}

//������������ ��������� � ������ ���, ������� ����������� ��������� � �������.
// �������: LIST, ADD, EDIT, DELETE.
//��� ������ � ������� ������ ��� � ������� ��������� ����� TodoList, �������
// ������ �������� �� �������� � ������ �� ������� ���. ���������� ��� ������ �
// ��������� ����� � ������� ������������ ������.
//� ������ Main �������� ��� ��� ���������� �������������� � ������������� �����
// ���� ������ � �������.
//������� ������ ������:
//
//LIST � ������� ���� � �� ����������� ��������;
//ADD � ��������� ���� � ����� ������ ��� ���� �� ����������� �����, ������� ���������
// ���� �����, ���� ������� �����; ���� ������ �������������� ������ - �������� � ����� ������.

//EDIT � �������� ���� � ��������� �������; ���� ������ �������������� ������ - ������ �� ������.

//DELETE � �������; ���� ������ �������������� ������ - ������ �� ������.
//������� �������� ������������� � ������� ����� �������.
//
//
//
//������� ������ �� ������� ��� (������ ������� ������� ���� ������������)
//
//ADD buy milk
//
//��������� ���� "buy milk"
//
//ADD learn java
//
//��������� ���� "learn java"
//
//LIST
//
//0 - buy milk
//
//1 - learn java
//
//EDIT 0 make a cup of tea
//
//���� "buy milk" �������� �� "make a cup of tea"
//
//DELETE 1
//
//���� "learn java" �������
//
//LIST
//
//0 - make a cup of tea
//
//DELETE 100
//
//���� � ����� ������� �� ����������