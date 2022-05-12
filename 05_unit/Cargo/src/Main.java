public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions();
        dimensions.setHeight(10.1);
        dimensions.setLatitude(15.5);
        dimensions.setLenght(15);

        Cargo misha = new Cargo(dimensions, 500, "Serbia", "653358LOX", true);
        System.out.println(misha);

    }
}
