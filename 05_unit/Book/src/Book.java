public class Book {
    private final String name;
    private final String author;
    private final int countPgs;
    private final int numberISBN;

    public Book(String name, String author, int countPgs, int numberISBN) {
        this.name = name;
        this.author = author;
        this.countPgs = countPgs;
        this.numberISBN = numberISBN;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getCountPgs() {
        return countPgs;
    }

    public int getNumberISBN() {
        return numberISBN;
    }
}
