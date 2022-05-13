public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(5, 6,8);
        Dimensions copyDimensions = dimensions.setHeight(10.2);


        Cargo misha = new Cargo(copyDimensions, 500, "Serbia", "653358LOX", true);
        System.out.println(misha);

    }
}
