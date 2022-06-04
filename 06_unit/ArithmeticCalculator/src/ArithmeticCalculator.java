public class ArithmeticCalculator {
    public double x;
    public double y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
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
            case DIVISION -> {
                if ( y == 0){
                    System.out.println("It cannot be divided by 0");
                } else {
                    System.out.println("Quotient: " + (x / y));
                }
            }
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
