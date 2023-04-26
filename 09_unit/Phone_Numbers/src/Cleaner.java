public class Cleaner {

    public void cleanNum (String num){
        String regex = "[^0-9]";
        String newNum = num.replaceAll(regex,"");
        System.out.println("Ќомер после удалени€ лишних знаков - " + newNum);
        System.out.println(newNum.length());


//        for(int i = 0; i < newNum.length(); i++){
//            System.out.println(newNum.charAt(i));
//        }

        if (newNum.length() == 11 && newNum.charAt(0) == '7' ){ // вывод правильного номера
            System.out.println(newNum);

        } else  if (newNum.length() == 11 && newNum.charAt(0) == '8'){ //замена 8 на 7
            String newNumber = "7" + newNum.substring(1);
            System.out.println("Ќомер после замены 8 на 7 - " + newNumber);

        } else if (newNum.length() == 10){
            System.out.println("Ќомер после добавлени€ семерки - " + "7" + newNum);

        } else {
            System.out.println("¬веден неверный формат номера");
        }
    }
}
