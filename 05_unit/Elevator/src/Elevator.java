/*
�������� ����� Elevator, ����������� ������ ������������� �����. � ������ ��������:
���������� currentFloor (������� ����), minFloor � maxFloor (����������� � ������������ �����).
��� ���������� � int.
����������� � ����� ����������� minFloor � maxFloor, ����������� ��� ���������
� ��������������� ���������� ������.
�������� ���������� currentFloor ���������� ������ ���� ����� 1.
����� getCurrentFloor, ������������ ������� ����, �� ������� ��������� ����.
����� moveDown, ������������ ���� �� ���� ���� ���� (����������� �������� ����������
 currentFloor �� �������).
����� moveUp, ������������ ���� �� ���� ���� �����.
����� move(int floor), ������������ ���� �� �������� � ��������� ����, ����
�� ����� �����. ���� �������� � ������ ����� �������, ������ �� ������ � ��������
� ������� ��������� �� ������. ���� ����� ����� ���������� ���� ������ ���������������,
�� ������ �����, � ������� ������ � ������� moveUp � moveDown, � ������ �������� � ������� �������
���� ����� ������� ����������� ����� �������.
 */
public class Elevator {
    protected int currentFloor = 1;
    protected int minFloor;
    protected int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }


    /**
     * �����, ����������� ���� �� 1 ���� �����
     */
    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
        System.out.println(currentFloor);
    }

    /**
     * �����, ���������� ���� �� 1 ���� ����
     */
    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
        System.out.println(currentFloor);
    }

    /**
     * �����, ��������� ����, � ����������� �� ���������� �����, ��� ���� ���������� � ������� ������� ����.
     * ��� ������ ��������� �����, ������������ ������
     *
     * @param floor �������� ���� �������������
     */
    public void move(int floor) {
        while (floor != currentFloor) {
            if (floor >= minFloor && floor < currentFloor) {
                moveDown();
            } else if (floor <= maxFloor && floor > currentFloor) {
                moveUp();
            } else {
                System.out.println("Wrong number floor");
                break;
            }
        }

    }
}

           /* while (floor != currentFloor) {
                if (floor >= minFloor && floor < currentFloor) {
                    moveDown();
                } else if (floor <= maxFloor && floor > currentFloor) {
                    moveUp();
                } else {
                    System.out.println("Wrong number floor");

                }
            }*/
