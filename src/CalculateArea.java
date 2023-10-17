public class CalculateArea implements GeometricFigure {
    public static void main(String[] args) {
        CalculateArea rectangle = new CalculateArea();
        System.out.println(rectangle.calculateArea(4, 5));
        CalculateArea triangle = new CalculateArea();
        System.out.println(triangle.calculateArea(5.0, 2.0));
        CalculateArea hexagon = new CalculateArea();
        System.out.println(hexagon.calculateArea(10));

    }

    @Override
    public double calculateArea(int a) {
        double sqrtOfThree = Math.sqrt(3);
        double areaOfTriangle = ((a * a) * sqrtOfThree) / 2;
        double areaOfHexagon = 3 * areaOfTriangle;
        return roundTo1DecimalPlace(areaOfHexagon);
    }

    @Override
    public double calculateArea(double a, double h) {
        return (a * h) / 2;
    }

    @Override
    public int calculateArea(int a, int b) {
        return a * b;
    }

    public static double roundTo1DecimalPlace(double value) {
        return Math.round(value * 10.0) / 10.0;
    }
}


//    Następnie, stwórz następujące implementacje, które będą zawierać pola wymagane
//    do wyliczenia pola figury:
//    Rectangle;
//    Triangle;
//    Hexagon.ia
//    Dopisz testy sprawdzające Twoje wyliczen.
