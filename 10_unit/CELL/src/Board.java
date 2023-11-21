//public class Board {
//    String x = "x";
//    String empty = "";
//    int cell;
//    String [][] board = new String[cell][];
//
//    public int getCell() {
//        return cell;
//    }
//    public void setCell(int cell) {
//        this.cell = cell;
//    }
//
//   public void getBoard (){
//        for (int i = 0; i < board.length; i++){
//            for(int y = 0; y <board[0].length; y++){
//
//            }
//        }
//   }
//}
//
//
///*public static char[][] getTwoDimensionalArray(int size) {
//
//    //TODO: Написать метод, который создаст двумерный массив char заданного размера.
//    // массив должен содержать символ SYMBOL по диагоналям, пример для size = 3
//    // [X,  , X]
//    // [ , X,  ]
//    // [X,  , X]
//
//    char [][] cross = new char[size][size];
//    for(int i = 0; i < cross.length; i++){
//        for (int j = 0; j < cross[i].length; j++) {
//            cross[i][j] = (j == i || j == cross.length - 1 - i) ? 'x' : ' ';
//            //System.out.print(cross[i][j]);
//        }
//        //System.out.println();
//    }
//    return cross;
//}
//    public static void main(String[] args) {
//        char [][] cross = getTwoDimensionalArray(3);
//        for(int i = 0; i < cross.length; i++){
//            for (int j = 0; j < cross[i].length; j++) {
//                System.out.print(cross[i][j]);
//            }
//            System.out.println();
//        }
