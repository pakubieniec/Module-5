public class Hexagon implements GeometricFigure{
    public double calculateArea(int a) {
        double sqrtOfThree = Math.sqrt(3);
        double areaOfTriangle = ((a * a) * sqrtOfThree) / 2;
        double areaOfHexagon = 3 * areaOfTriangle;
        return roundTo1DecimalPlace(areaOfHexagon);
    }

    @Override
    public double calculateArea(double a, double h) {
        return 0;
    }

    @Override
    public int calculateArea(int a, int b) {
        return 0;
    }

    public static double roundTo1DecimalPlace(double value) {
        return Math.round(value * 10.0) / 10.0;
    }
}
