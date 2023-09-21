public class Main {
    public static void main(String[] args) {
        Company companyFirst = generateCompany("MishaLoxCompany", 20, 10,5);
        System.out.println(companyFirst);
    }



    public static Company generateCompany (String name, int OperAmount, int ManAmount, int TopAmount){
        Company company = new Company(name);
            for (int i = 0; i < OperAmount; i++){
                Operator operator = new Operator(50_000, company);
                company.hire(operator);
            }
            for (int i = 0; i < ManAmount; i++){
                Manager manager = new Manager(80_000, company);
                company.hire(manager);
            }
            for (int i = 0; i < TopAmount; i++){
                TopManager topManager = new TopManager(100_000, company);
                company.hire(topManager);
            } return company;
        }

}


/*
1. �������� ����� �������� Company, ���������� ����������� � ����������� ������:

���� ������ ���������� � hire(Employee employee),
���� ������ ����������� � hireAll(Collection<Employee> employes),
���������� ���������� � fire(Employee employee),
��������� �������� ������ �������� � getIncome().
������ ����� �� ������ ����� ����������� static, ��� �������� ������� ������� ������
 Company ����� ���� ������ �����������, ���� ������ ������, ���������� � ����. ���������
 � ������������ �������� ������� �������� �� ��������� ������ ������ ������ ����������.


2. �������� ��� ������, ������������ ������ ��������� ����� (count). ��� ������
 ��������� �����������, ��������������� �� �������� � ����������� ���������� �����:

List<Employee> getTopSalaryStaff(int count),
List<Employee> getLowestSalaryStaff(int count).

3. �������� ������ ����������� � ����������� � ��������� � ��������� ���������� ��������:

Manager � �������� ������������ �� ������������� ����� � ������ � ���� 5% �� ������������ ���
 �������� �����. ���������� ������������ ����� ��� �������� ����������� ��������� ������� ��
 115 000 �� 140 000 ������.
TopManager � �������� ������������ �� ������������� ����� � ������ � ���� 150% �� ����������
 �����, ���� ����� �������� ����� 10 ��� ������.
Operator � �������� ������������ ������ �� ������������� �����.
������ ����� ���������� ������ ���������������� ��������� Employee. � ���������� Employee ������
���� �������� �����, ������������ �������� ����������, � getMonthSalary().

��������� � ������������ �������� ������ �������� � ������������ � ������� ���������� �������.
 � ���������� �������� ����������� ������.

 ��� ������������ � ������������ ������ ����� �������:

�������� � ������� � ��������: 180 ���������� Operator, 80 ���������� �� �������� Manager, 10
 ���-���������� TopManager.
������������ ������ �� 10�15 ����� ������� ������� � ��������.
������������ ������ �� 30 ����� ������ ������� � ��������.
������� 50% �����������.
������������ ������ �� 10�15 ����� ������� ������� � ��������.
������������ ������ �� 30 ����� ������ ������� � ��������.


������� ������ ������ �������

������ �� ���� ������� �� ��������:

230 000 ���.
178 000 ���.
165 870 ���.
123 000 ���.
117 900 ���.


������������
�������� ��������� �������� ������ ����������� �������� �� ����� ������� ����������� � �������.
����� �������� ������ �������� ������ ������ ����������, ��������� �������� ������ �� Company �
����������� ������ Company � ������� ������������ ��� �������.
� ������ ��������� ������� ������� ����� ������������ �������� count, ������������� ��� �����������
���������� ����������� � ��������.
 */