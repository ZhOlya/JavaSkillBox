import java.util.Arrays;

public class Main {

    public static char[][] getTwoDimensionalArray(int size){
        char [][] board = new char[size][size];
        for (int i = 0; i < board.length; i++){        //������� ������� �������
            for (int y = 0; y < board[0].length; y++){ // ������� �������� � �������� �������

                board[i][y] = (i == y || y == board.length - 1 - i) ? 'y' : ' '; //
//                if (i == y){
//                    board[i][y] = 'X';
//                } else {
//                    board[i][y] = ' ';
//                }
            }
        }
        return board;
    }

    public static void main(String[] args) {
        char [][] cell = getTwoDimensionalArray(16);
        //System.out.println(Arrays.toString(cell));
        for (int x = 0; x < cell.length; x++){
            System.out.println(cell[x]);

        }
    }






//    public static void main(String[] args) {
////        int size = 7;
////        Board cells = new Board();
////        cells.setCell(size);
////        Board [][] board = new Board [size][];
//    }
//
//    //� ������ TwoDimensionalArray   ���������� �����
//    //
//    //public static char[][] getTwoDimensionalArray(int size) {
//    //
//    //������� ������ ������� ��������� ������ ������� size,
//    // �� ���������� �������� ������ ���� ������� 'X', � ��������� ������� ������ ' '.
}
