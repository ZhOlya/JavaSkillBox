//����� �������� ����� sequentialWordsNumbers, ������� � �������� ��������� ��������� �����
// � ����� ������ ������ ����� ��� ���������� ����� � ������� ������� � ���������� ������.
// ����� ���������� �������� ��� ������������� ���������� ���������.
// For example : ������� �����:
//��� ������ �����, ��� ������� ������ ���������
//���������:
//(1) ��� (2) ������ (3) �����,  ��� (5) ������� (6) ������ (7) ���������
//������ � ������������
//
//����������� ����� �������� � ������ ������� indexOf � �����.
//���������� ����� ������ � ������ ������ StringBuilder, � ����� ������� ������ ������ String

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Operation words = new Operation();
////        System.out.println("Enter the text, please.");
////        String enterText = new Scanner(System.in).nextLine();
        words.setText("������ ����� ��� �������� ����");

        words.sequentialWordsNumbers();
        System.out.println(words);



    }

}
