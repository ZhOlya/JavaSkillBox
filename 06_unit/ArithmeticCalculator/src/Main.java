public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator one = new ArithmeticCalculator(5,7);
        one.calculate(Operation.ADD);
        one.calculate(Operation.SUBTRACT);
        one.calculate(Operation.MULTIPLY);
    }




}
