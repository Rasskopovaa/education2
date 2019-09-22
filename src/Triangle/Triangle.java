package Triangle;

public class Triangle {
    private double sideA;
    private double sideB;
    private double angleAB;

    Triangle(double sideA, double sideB, double angleAB) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.angleAB = angleAB;
    }

    public double getSquare() {
        double square = this.sideA * this.sideB * Math.sin(this.angleAB * Math.PI / 180);
        return square;
    }

    double getPerimeter() {
        double sideC = Math.sqrt(Math.pow(this.sideA, 2) + Math.pow(this.sideB, 2) - 2 * this.sideA * this.sideB * Math.cos(this.angleAB * Math.PI / 180));
        double perimeter = this.sideA + this.sideB + sideC;
        return perimeter;
    }
}