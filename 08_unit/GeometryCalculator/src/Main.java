public class Main {
    public static void main(String[] args) {
        GeometryCalculator triangle = new GeometryCalculator(6,7,9);
        triangle.makeTriangle();

        GeometryCalculator ball = new GeometryCalculator(5);
        ball.makeBall();

        GeometryCalculator circle = new GeometryCalculator(21);
        circle.makeCircle();



    }
}
