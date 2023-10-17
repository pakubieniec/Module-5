public class Rectangle implements GeometricFigure{
    @Override
    public double calculateArea(int a) {
        return 0;
    }

    @Override
    public double calculateArea(double a, double b) {
        return a * b;
    }

    @Override
    public int calculateArea(int a, int b) {
        return a * b;
    }
}
