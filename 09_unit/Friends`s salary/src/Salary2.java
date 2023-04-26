public class Salary2 {
    double sum = 0;
    int index = 0;
    String combainNumber = "";

    public void determinationAmount() { //Опредление суммы
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
        String regixLetter = "[А-Я а-я]";
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

//Мама3.5папа
        for (index = 0; index < newText.length(); index++){ //Перебераем значение каждого индекса в строке
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
//        String newText = someText.replaceAll(regixSpace, ""); // Заменяем все пробельные символы на пустотку
//        System.out.println(newText);
//
//        for (index = 0; index < newText.length(); index++) { //
//            char currentSybol = newText.charAt(index);
//            if (Character.isDigit(currentSybol)) {
//                combainNumber = combainNumber + currentSybol;
//
////                combainNumber = newText.substring(); //Число, которое сформированно подстрокой от индекса, который явдяется цифрой, до индекса, который является буквой
//
//            } else determinationAmount();
//        }
//        determinationAmount();
//        System.out.println("Total friends` salary is " + sum);
//    }

