public class Operation {
    String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    int space;
    int wordsNumber = 1;
    String nextWord;


    // word numbering
    public void sequentialWordsNumbers() {
        StringBuilder result = new StringBuilder("(" + wordsNumber + ") " + text);
        int indexSpace = result.indexOf(" ", 5);
        while (indexSpace >= 0) {
            wordsNumber++;
            result.replace(indexSpace, indexSpace + 1, " (" + wordsNumber + ") ");
            indexSpace = result.indexOf(" ", indexSpace + 6);
            System.out.println(Integer.toString(indexSpace) + " - " + result);

        }
        System.out.println(result);
    }
}
