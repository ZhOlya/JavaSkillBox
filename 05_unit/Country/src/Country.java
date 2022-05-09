/*
�������� POJO-����� Country, ������� ����� �������������� ��� ��������
 ������ � �������, �� ���������� ������:
��������. ����������� ���������.  ������� � ���������� ����������.  �������� �������.
������� ������ � ����.  �������� � ���� ������:
����������� � ����� ���������� � ��������� ������.
������-������� ��� ���� ����� ������.
������-������� ��� ���� ����� ������.
 */
public class Country {
    protected String name;
    protected int population;
    protected int square; //��.��.
    protected String nameCapital;
    protected boolean sea;

    public Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getSquare() {
        return square;
    }

    public void setSquare(int square) {
        this.square = square;
    }

    public String getNameCapital() {
        return nameCapital;
    }

    public void setNameCapital(String nameCapital) {
        this.nameCapital = nameCapital;
    }

    public boolean isSea() {
        return sea;
    }

    public void setSea(boolean sea) {
        this.sea = sea;
    }
}
