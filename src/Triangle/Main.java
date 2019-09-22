package Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(5, 17, 35);
        System.out.println("Площадь треугольника1: " + triangle1.getSquare());
        System.out.println("Периметр треугольника1: " + triangle1.getPerimeter());
    }
}
