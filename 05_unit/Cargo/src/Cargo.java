/*
�������� ������������� ����� ��� �������� ���������� � ������, ������������
 � ���������� ������. �������� ������ ���������� ��������������.
�������� � ������ ��������� ����:
��������;
�����;
����� ��������;
�������� � ����� �� ��������������;
��������������� ����� (����� ��������� �����);
�������� �� ���� �������.
�������� ����� ���������� ��������������.
���� ����� ������� � ������������ � �������, ������� � ��� ����������.

�������� � ������, ������ � ����� � ������ ��������� � ��������� ������������� ������
 Dimensions. �������� ����� Dimensions � ���������������� ������ � ���������� � �� �����
 ���������� ������ ����� (�������� ������ ���������� ��������������).
���������� � ������ ������, ������ ����������� �������� ����� ��������, �������� � ����� �����
 ��� ��������� ��������� ������� ���� �������� ��� �����.
 */
public class Cargo {
    private final Dimensions dimensions;
    private final int weight;
    private final String address;
    private final String registrationNumber;
    private final boolean fragile;

    public Cargo(Dimensions dimensions,
                 int weight,
                 String address,
                 String registrationNumber,
                 boolean fragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.address = address;
        this.registrationNumber = registrationNumber;
        this.fragile = fragile;
    }


    //����������� ��� �������� �������
    public Cargo(){
        weight = 0;
        address = "";
        registrationNumber = "";
        fragile = false;
        dimensions = null;
    }
    // Setters of dimensions, weight and address
    public Cargo setDimension (Dimensions dimension){
        return new Cargo(dimensions, weight, address, registrationNumber, fragile); //������ � ������� ������� �� ����� ������?
    }

    public Cargo setWeight (int weight){
        return new Cargo(dimensions, weight, address, registrationNumber, fragile);
    }

    public Cargo setAddress (String address){
        return new Cargo(dimensions, weight, address, registrationNumber, fragile);
    }

    //Getters all variables
    public Dimensions getDimensions() {
        return dimensions;
    }

    public int getWeight() {
        return weight;
    }

    public String getAddress() {
        return address;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public boolean isFragile() {
        return fragile;
    }

    public String toString(){
        return dimensions + "/n"+
                "Weight: "+ weight + "kg"+ "/n"+
                "Address: " + address + "/n"+
                "Registation number: " + registrationNumber + "/n"+
                "Fragile: " + fragile;
    }
}
