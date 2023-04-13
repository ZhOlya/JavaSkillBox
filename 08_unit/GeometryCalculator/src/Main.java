public class Main {
    public static void main(String[] args) {
        GeometryCalculator triangle = new GeometryCalculator();
        triangle.makeTriangle(4,5,6);
        triangle.makeTriangle(5,6,8);
        triangle.sqareCalculate();

        GeometryCalculator circle = new GeometryCalculator();
        circle.makeCircle(5);
        circle.sqareCalculate();

        GeometryCalculator ball = new GeometryCalculator();
        ball.makeBall(15);
        ball.volumeCalculate();



//        GeometryCalculator ball = new GeometryCalculator(5);
//        ball.makeBall();
//
//        GeometryCalculator circle = new GeometryCalculator(21);
//        circle.makeCircle();



    }
}
