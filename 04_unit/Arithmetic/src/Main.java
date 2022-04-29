public class Main {

    public static void main(String[] args) {
        Arithmetic one = new Arithmetic(5, 9);
        System.out.println("One: ");
        System.out.println("sum = " + one.sum());
        one.max();
        one.mult();
        one.min();


        Arithmetic two = new Arithmetic(50, 3);
        System.out.println("Two: ");
        two.min();
        two.max();
        two.mult();
        two.sum();


            }
}
