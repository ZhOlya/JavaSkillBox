public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;
    private static int allPrice = 0; //all price of all items
    private static int allCount = 0;// all counts of all items
    private static int basketCount = 0;

    public static int getBasketCount(){
        return basketCount;
    }

    public static int getAllPrice() {
        return allPrice;
    }

    public static int getAllCount() {
        return allCount;
    }

    private static void incrementAllStaticFields(int price, int count){
        allPrice += price;
        allCount += count;
    }

    public Basket() {
        increaseCount(1);
        items = "List items:";
        this.limit = 1000000;
        basketCount++;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }
    
    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        add(name, price,count,0 );
    }

    public void add(String name, int price, int count, double weight){
        boolean error = false;
        if (contains(name)) {
            error = true;
        }
        if (totalPrice + count * price >= limit) {
            error = true;
        }
        if (error) {
            System.out.println("Error occured :(");
            return;
        }
        int currentPrice = count * price;
        items = items + "\n" + name + " - " +
                count + " pcs - " + price + " rub." + weight + " gr";

        totalPrice += currentPrice;
        Basket.incrementAllStaticFields(currentPrice, count);
        totalWeight = totalWeight + weight * count;
        Basket.averagePrice(currentPrice, count);

    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }


    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Basket is empty");
        } else {
            System.out.println(items);
        }
        System.out.println("Total price: "+ totalPrice+ " rub.");
        System.out.println("Total weight: " + totalWeight + " gr");
    }
//статический метод расчёта средней цены товара во всех корзинах.
// Он должен рассчитывать и возвращать отношение общей стоимости всех корзин к общему количеству всех товаров.
    private static double x = 0;

    public static double getX(){
        return x;
    }

    private static void averagePrice(int allPrice, int allCount){
        x = allPrice / allCount;
    }

    /*
    Реализуйте статический метод расчёта средней стоимости корзины
     (отношение общей стоимости всех корзин к количеству корзин).
     */
    public static double  getAveragePriceOfBasket(){
        double res = 0d;
        if (basketCount != 0){
            res = allPrice / basketCount;
        }
        return res;
    }
}
