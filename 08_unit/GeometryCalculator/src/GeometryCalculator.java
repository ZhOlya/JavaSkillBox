import java.util.Objects;

public class GeometryCalculator {

    double radius = 0;
    double triangleA = 0;
    double triangleB = 0;
    double triangleC = 0;
    double pi = Math.PI;
    String name;
    double sqare;
    double volume;


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

    public GeometryCalculator() {
        name = "";
    }

    //    public GeometryCalculator(double triangleA, double triangleB, double triangleC) {
//        this.triangleA = triangleA;
//        this.triangleB = triangleB;
//        this.triangleC = triangleC;
//    }
    private boolean isFigureRelase() {
        if (name.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    public void sqareCalculate() {
        if (name.equals("Triangle")) {
            double p = (triangleA + triangleB + triangleC) / 2; // полупериметр
            double formula = p * (p - triangleA) * (p - triangleB) * (p - triangleC);
            sqare = Math.sqrt(formula);
        } else if (name.equals("Circle")) {
            double rad = Math.pow(radius, 2);
            sqare = rad * pi;
        }
        System.out.println("Площадь " + name + " равна " + sqare);
    }

    public void volumeCalculate(){
        if (name.equals("Ball")){
            double rad = Math.pow(radius, 3);
            volume = (4 * pi * rad) / 3;
        }
        System.out.println("Volume " + name + " is " + volume);
    }

    public void makeTriangle(double triangleA, double triangleB, double triangleC) {
        if (isFigureRelase()) {
            System.out.println("Объект уже создан, это - " + name);
        } else if ((triangleA + triangleB > triangleC) &&
                (triangleA + triangleC > triangleB) &&
                (triangleB + triangleC > triangleA)) {
            name = "Triangle";
            this.triangleA = triangleA;
            this.triangleB = triangleB;
            this.triangleC = triangleC;
        } else {
            System.out.println("Постороить треугольник невозможно");
        }
    }


    public void makeBall(double radius) {
        if (isFigureRelase()) {
            System.out.println("Объект уже создан, это - " + name);
        } else {
            this.radius = radius;
            name = "Ball";
        }
    }

    public void makeCircle(double radius) {
        if (isFigureRelase()) {
            System.out.println("Объект уже создан, это - " + name);
        } else {
            this.radius = radius;
            name = "Circle";
        }


    }
}
