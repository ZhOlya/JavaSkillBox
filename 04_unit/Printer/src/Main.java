public class Main {
    public static void main(String[] args) {
        int allAllPages;
        Printer1 doc = new Printer1();
        int allPgs;


        allAllPages = Printer1.getAllAllPages();
        System.out.println(allAllPages);


        doc.append("Who is lox? ", "Misha lox! ", 50);
        doc.append("Misha is...", "Misha is...", 10);
        doc.print("To print");
        allPgs = doc.getAllPages();
        System.out.println("All pages: " + allPgs);

        Printer1 doc1 = new Printer1();
        doc1.append("Olya is pretty girl ", "Who is Olya?", 20);
        System.out.println("");
        doc1.print("To print");

        allAllPages = Printer1.getAllAllPages();
        System.out.println("Total pages: " + allAllPages);




    }
}
