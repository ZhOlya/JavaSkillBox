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
        int boxNum = 0; // ���������� ����� ������
        int containerNum = 0;// ���������� ����� �����������
        for( int i = 1; i <= truck; i++){
            System.out.println( "�������� " + i +":");
            for (int y = 1; y <= 12; y++){
                if (container <= containerNum)
                    break;
                System.out.println("\t" + "��������� " + ++containerNum + ":");
                for ( int z = 1; z <= 27; z++){
                    if (box <= boxNum)
                        break;
                    System.out.println("\t" + "\t" +" ���� " + ++boxNum);
                }
            }
        }
    }


}
