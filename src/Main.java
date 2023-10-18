import java.io.File;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Triangle tr = new Triangle(4,5);
        System.out.println(tr.calculateArea());

        Rectangle rec = new Rectangle(5,4);
        System.out.println(rec.calculateArea());

        Hexagon hex = new Hexagon(10);
        System.out.println(hex.calculateArea());

        Square sq = new Square(5,4);
        System.out.println(sq.calculateDiameter());
        System.out.println(sq.calculateArea());

        CreateNewFile file = new CreateNewFile();
        file.writeUserInputToFile();
        file.readFromFile("files//test2.txt");

        PrintDirectory printDir = new PrintDirectory();
        printDir.printDirectory(new File("C:\\Users\\Patty\\Documents\\NetBeansProjects"));
    }

}