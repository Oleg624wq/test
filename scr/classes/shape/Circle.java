package classes.shape;

public class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        if (radius <= 0){
            throw new IllegalArgumentException("Радиус должен быть положительным");
        }
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    @Override
    public double calculatePerimeter() {
       return 2 * Math.PI * radius; 
    }
    @Override
    public String toString() {
        return String.format("Круг [R=%.2f]", radius);
    }
}
