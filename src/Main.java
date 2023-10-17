// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Triangle tr = new Triangle();
        System.out.println(tr.calculateArea(4,5));

        Rectangle rec = new Rectangle();
        System.out.println(rec.calculateArea(5, 4));

        Hexagon hex = new Hexagon();
        System.out.println(hex.calculateArea(10));

        Square sq = new Square();
        System.out.println(sq.calculateDiameter(5,4));
        System.out.println(sq.calculateArea(5,4));
    }
}