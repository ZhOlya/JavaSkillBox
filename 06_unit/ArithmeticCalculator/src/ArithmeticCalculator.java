public class ArithmeticCalculator {
    public int x;
    public int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
/*    public ArithmeticCalculator(int x, int y) {
        this.x = x;
        this.y = y;
    }*/

    public void calculate (Operation operation){
        switch (operation){
            case ADD -> System.out.println("Sum: " + (x + y));
            case SUBTRACT -> System.out.println("Difference: " + (x - y));
            case MULTIPLY -> System.out.println("Product: " + (x * y));
        }

    }
}
/*
�������� ����� ArithmeticCalculator, ������� ����� ��������� �������������� �������� ��� �������.

���������� ����������� � ����� �����������-�������, ������� ��������� ���������� ����� � ��������� ������.

���������� ����� calculate, �� ���� �������� ��������� ���� �� �������������� �������� (������
 ������ Operation � �������� ��������� ����� �������), ������� ����� ���������� � ����� �������,
  ����������� � ����������� ��� �������� �������.

�������� Enum Operation � ����� ����������: ADD, SUBTRACT, MULTIPLY. ��� �������� �����
��������������� �������������� ��������� � ��������, ��������� � ���������.
 */
