import java.io.File;

public class Main {
    private static  int NEW_WEIGHT = 900;


    public static void main(String[] args) {

        String firstFolder = "D:\\01_Study\\JavaSkillBox\\19_unit\\01 Image\\img1";
        String secondFolder ="D:\\01_Study\\JavaSkillBox\\19_unit\\01 Image\\newImg";

        File imgFirst = new File(firstFolder);

        long start = System.currentTimeMillis();

        File [] files = imgFirst.listFiles();

        int middle = files.length / 2;

        File [] filesPartOne = new File[middle];
        System.arraycopy(files, 0,filesPartOne, 0,filesPartOne.length);
        ImageResizer resizeOne = new ImageResizer (filesPartOne,NEW_WEIGHT, secondFolder, start);

        File [] filePartTwo = new File[files.length - middle];
        System.arraycopy(files, middle, filePartTwo, 0, filesPartOne.length);
        ImageResizer resizerTwo = new ImageResizer(filePartTwo, NEW_WEIGHT, secondFolder, start);

        resizeOne.start();
        resizerTwo.start();
    }
}
