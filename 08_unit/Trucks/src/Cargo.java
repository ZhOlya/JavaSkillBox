import java.security.PublicKey;

public class Cargo {
    //�����������, ��� �� ����������� ���� � ������ ����������� �������.
    // � ��� ���� ��������� � ����������. � ������ �������� ���������� �������� 12 �����������.
    // � ������ ��������� � �� ����� 27 ������. �����, ���������� � ��������� �������������.

    int box;
    int container;
    int truck;

    public int getBox() {
        return box;
    }

    public void setBox(int box) {
        this.box = box;
    }

    public int getContainer() {
        return container;
    }

    public void setContainer(int container) {
        this.container = container;
    }

    public int getTruck() {
        return truck;
    }

    public void setTruck(int truck) {
        this.truck = truck;
    }

    //Cargo (int box){
    //    this.box = box;
    //}

    public void calculate(){
            container = box / 27;
            if ((box % 27) > 0) {
                container++;
            }

            truck = container / 12;
            if ((container % 12) > 0) {
                truck++;
            }

    }

    public void result(){
        if (box > 0){
            calculate();
            System.out.println("���������� ������ - " + box + System.lineSeparator() +
                    "����������: "+ System.lineSeparator() +
                    "����������� ����������� - " + container + System.lineSeparator() +
                    "���������� ���������� - " + truck );
        } else {
            System.out.println("������������ ���������� ������");
        }

    }
    public void numbering (){
       int currentBoxNum = 0; // ���������� ����� ������
      int currentContainerNum = 0;// ���������� ����� �����������

        for( int numberOftruck = 1; numberOftruck <= truck; numberOftruck++){
            System.out.println( "�������� " + numberOftruck +":");
            for (int containerNum = 1; containerNum <= 12; containerNum++){
                if (container <= currentContainerNum)
                    break;
                System.out.println("\t" + "��������� " + ++currentContainerNum + ":");
                for (int boxNum = 1; boxNum <= 27; boxNum++){
                    if (box <= currentBoxNum)
                        break;
                    System.out.println("\t" + "\t" + "\t" +" ���� " + ++currentBoxNum);
                }
            }
        }
    }


}
