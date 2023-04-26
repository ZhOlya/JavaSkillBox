public class Salary {
    double sum = 0;
    int index = 0;
    String combainNumber = "";

    public void determinationAmount() { //Опредление суммы
        if (!combainNumber.isEmpty()) {
            sum += Double.parseDouble(combainNumber);
            combainNumber = "";
        }
    }

    public void salaryCalculate(String someText) {

        for (index = 0; index < someText.length(); index++) { //
            char currentSybol = someText.charAt(index);
            if (Character.isDigit(currentSybol)) {
                combainNumber = combainNumber + currentSybol;

            } else determinationAmount();
        }
        determinationAmount();
        System.out.println("Total friends` salary is " + sum);


    }
}

