public class Salary2 {
    double sum = 0;
    int index = 0;
    String combainNumber = "";

    public void determinationAmount() { //���������� �����
        if (!combainNumber.isEmpty()) {
            sum += Double.parseDouble(combainNumber);
            combainNumber = "";
        }
    }

    public void salaryCalculate(String text){
        //1. Delete all spaces
        String regixSpace = "[\s]+";
        String newText = text.replaceAll(regixSpace, "");
        System.out.println(newText);
        String regixLetter = "[�-� �-�]";
        for(int x = 0; x<newText.length();x++){
            int i = newText.indexOf(regixLetter);
            System.out.println(i);
        }
        int i = newText.indexOf(regixLetter);
        System.out.println(i);

        //2.
        int index2 = 0;
        int index1 = 0;

//        String www = newText.replaceAll(regixLetter, "W");
//        System.out.println(www);

//����3.5����
        for (index = 0; index < newText.length(); index++){ //���������� �������� ������� ������� � ������
            char symbol = newText.charAt(index);
            if (Character.isDigit(symbol)){
                index1 = index;
            }

            //String needString = newText.substring(index1);
            //System.out.println(needString);
//                index2 = newText.indexOf(regixLetter);
//                System.out.println(index2);
            }
        }
    }

//    public void calculateSalary(String someText) {
//        String regixSpace = "[\s]+";
//        String newText = someText.replaceAll(regixSpace, ""); // �������� ��� ���������� ������� �� ��������
//        System.out.println(newText);
//
//        for (index = 0; index < newText.length(); index++) { //
//            char currentSybol = newText.charAt(index);
//            if (Character.isDigit(currentSybol)) {
//                combainNumber = combainNumber + currentSybol;
//
////                combainNumber = newText.substring(); //�����, ������� ������������� ���������� �� �������, ������� �������� ������, �� �������, ������� �������� ������
//
//            } else determinationAmount();
//        }
//        determinationAmount();
//        System.out.println("Total friends` salary is " + sum);
//    }

