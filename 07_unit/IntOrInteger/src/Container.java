public class Container {
    //private Integer count; ����������� ���
    private Integer count = 0;// ��� �����������, � ������� ��� ��������

    public void addCount(int value) {
        count = count + value;
    }

    public int getCount() {
        return count;
    }
}

/*
������� 1
��������� ��� ������� IntOrInteger, ������� ������ � ��������� ����� Container ����� �������,
 ����� ������ �� ���������.

 ������� 2
�������� � ���� �� ������� ���, ������� � ������� ����� � �������������� ����� � ������� ����
� ��� �������� ���� ���� �������� �������� � ��������� � ��������, � ��� ����� ����� �.
 */
