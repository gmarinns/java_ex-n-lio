package entities;

public class ex5_1_1 {
    public double width;
    public double height;

    public double area(double width, double height) {
        return width * height;
    }

    public double perimeter(double width, double height) {
        return 2 * (width + height);
    }

    public double diagonal(double width, double height) {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

}
