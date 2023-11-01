public class Main {
    public static void main(String[] args) {
        Subscriber1 sub1 = new Subscriber1();
        Subscriber2 sub2 = new Subscriber2();

        Publisher publisher = new Publisher();

        publisher.addListener(sub1);
        publisher.addListener(sub2);

        publisher.createNewMessage("Hello, people!");
    }

}
