/*���������� �����, ������� ��������� � �������� ��������� ������, �
��������� ���������� ����� (�� ����� 100 ����). ����� ������ ��������� �����
�� ����� � ������� ������, ��������� �� ���������� ����,
 ��� ������ ����� ����� �� ��������� ������. ����� ���������� � ����� �� �������� �������.*/
public class Main {
    public static void main(String[] args) {
        String text = "Alice was beginning to get very tired of sitting by " +
                "her sister on the bank, and of having nothing to do: once " +
                "or twice she had peeped into the book her sister was reading," +
                " but it had no pictures or conversations in it, 'and what is " +
                "the use of a book,' thought Alice 'without pictures or conversation?" +
                "So she was considering in her own mind (as well a she could, " +
                "for the hot day made her feel very sleepy and stupid), whether " +
                "the pleasure of making a daisy-chain would be worth the trouble of" +
                "getting up and picking the daisies, when suddenly a White Rabbit with" +
                "pink eyes ran close by her." +
                "There was nothing so very remarkable in that;" +
                " nor did Alice think it so very much out of the way to hear" +
                " the Rabbit say to itself, 'Oh dear! Oh dear! I shall be late!' " +
                "(when she thought it over afterwards, it occurred to her that she" +
                " ought to have wondered at this, but at the time it all seemed quite";
        SplitText newText = new SplitText();
        newText.splitText(text);


    }
}