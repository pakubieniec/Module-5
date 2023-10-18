public class Hexagon implements GeometricFigure{

    int a;
    public Hexagon(int a){
        this.a = a;
    }
    public int calculateArea() {
        double sqrtOfThree = Math.sqrt(3);
        double areaOfTriangle = ((a * a) * sqrtOfThree) / 2;
        double areaOfHexagon = 3 * areaOfTriangle;
        return (int)roundTo1DecimalPlace(areaOfHexagon);
    }
    public static double roundTo1DecimalPlace(double value) {
        return Math.round(value * 10.0) / 10.0;
    }
}
