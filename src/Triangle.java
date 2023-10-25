public class Triangle implements GeometricFigure {
    private int a;
    private int h;

    public Triangle(int a, int h) {
        this.a = a;
        this.h = h;
    }

    public int calculateArea() {
        return (a * h) / 2;
    }
}
