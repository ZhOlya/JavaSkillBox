public class GeometryCalculator {

    double radius = 0;
    double triangleA = 0;
    double triangleB = 0;
    double triangleC = 0;
    double pi = Math.PI;


    public double getTriangleA() {
        return triangleA;
    }

    public void setTriangleA(double triangleA) {
        this.triangleA = triangleA;
    }

    public double getTriangleB() {
        return triangleB;
    }

    public void setTriangleB(double triangleB) {
        this.triangleB = triangleB;
    }

    public double getTriangleC() {
        return triangleC;
    }

    public void setTriangleC(double triangleC) {
        this.triangleC = triangleC;
    }

    public GeometryCalculator(double triangleA, double triangleB, double triangleC) {
        this.triangleA = triangleA;
        this.triangleB = triangleB;
        this.triangleC = triangleC;
    }

    public void makeTriangle (){
        if ((triangleA + triangleB > triangleC) &&
                (triangleA + triangleC > triangleB) &&
                (triangleB + triangleC > triangleA)) {
            double p = (triangleA + triangleB + triangleC) / 2; // полупериметр
            double formula = p * (p - triangleA) * (p - triangleB) * (p - triangleC);
            double sqareTriangle = Math.sqrt(formula);
            System.out.println("Площадь треугольника равна " + sqareTriangle);
        } else {
            System.out.println("Постороить треугольник невозможно");
        }
    }

    public GeometryCalculator(double radius) {
        this.radius = radius;
    }

    public void makeBall(){
        double rad = Math.pow(radius, 3);
        double volumeBall = (4 * pi * rad) / 3;
        System.out.println("Объем шара равен " + volumeBall);
    }

    public void  makeCircle(){
        double rad = Math.pow(radius,2);
        double sqareCircle = rad * pi;
        System.out.println("Площадь круга равна " + sqareCircle);

    }
}
