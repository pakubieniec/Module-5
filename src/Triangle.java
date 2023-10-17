public class Triangle implements GeometricFigure{
    @Override
    public double calculateArea(int a) {
        return 0;
    }

    @Override
    public double calculateArea(double a, double h) {
        return (a * h) / 2;
    }

    @Override
    public int calculateArea(int a, int h) {
        return (a * h) / 2;
    }
}
