public class Cleaner {

    public void cleanNum (String num){
        String regex = "[^0-9]";
        String newNum = num.replaceAll(regex,"");
        System.out.println("����� ����� �������� ������ ������ - " + newNum);
        System.out.println(newNum.length());


//        for(int i = 0; i < newNum.length(); i++){
//            System.out.println(newNum.charAt(i));
//        }

        if (newNum.length() == 11 && newNum.charAt(0) == '7' ){ // ����� ����������� ������
            System.out.println(newNum);

        } else  if (newNum.length() == 11 && newNum.charAt(0) == '8'){ //������ 8 �� 7
            String newNumber = "7" + newNum.substring(1);
            System.out.println("����� ����� ������ 8 �� 7 - " + newNumber);

        } else if (newNum.length() == 10){
            System.out.println("����� ����� ���������� ������� - " + "7" + newNum);

        } else {
            System.out.println("������ �������� ������ ������");
        }
    }
}
