public class Main {

    public static void main(String[] args) {
        Basket basketSenya= new Basket(5);


        Basket basketMisha = new Basket();
        basketMisha.add("Milk", 40);
        basketMisha.add("Sugar", 60,1,980);
        basketMisha.add("Bread", 38,2,30.3);

        basketMisha.print("Misha`s basket");

        System.out.println("");

        Basket basketOlya = new Basket();
        basketOlya.add("Juse",50, 2, 500);
        basketOlya.add("Candies", 100, 1,450);

        basketOlya.print("Olya`s basket");
        System.out.println("");

        Basket basketNatasha = new Basket();
        basketNatasha.add("Fish", 450, 2,1000);
        basketNatasha.add("Shrimps", 666,1,500);

        basketNatasha.print("Natasha`s basket");
        System.out.println("");

        Basket basketAlgis = new Basket();
        basketAlgis.add("Yogurt", 55, 4,50);
        basketAlgis.add("Protein bar", 25,5,28);

        basketAlgis.print("Algis`s basket");
        System.out.println("");

        Basket basketOleg = new Basket();
        basketOleg.add("Kal`chik", 1300,1);
        basketOleg.add("Tabacco", 450, 3,250);

        basketOleg.print("Oleg`s basket");
        System.out.println("");

        System.out.println("All price of all items: " + Basket.getAllPrice() +
                "\n" +"All count of items: " + Basket.getAllCount());
        System.out.println("");

        System.out.println("Average price of all baskets: " + Basket.getX() +
                "\n" + "Average price of basket: " + Basket.getAveragePriceOfBasket());

    }
}
