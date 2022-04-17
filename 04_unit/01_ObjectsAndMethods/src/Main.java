public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 1, 500);
        basket.add("Bread", 50,2,20);
        basket.add("Ice cream", 25, 10, 200);
        basket.print("Your basket");
    }
}
