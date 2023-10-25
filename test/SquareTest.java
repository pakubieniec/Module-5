import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {
    Square sq = new Square(5);
    Square sq2 = new Square(21);
    Square sq3 = new Square(3);

    @Test
    public void DiameterOfSquare5ShouldReturn20() {
        Assertions.assertEquals(20, sq.calculateDiameter());
    }

    @Test
    public void DiameterOfSquare21ShouldReturn84() {
        Assertions.assertEquals(84, sq2.calculateDiameter());
    }

    @Test
    public void DiameterOfSquare3ShouldReturn9() {
        Assertions.assertEquals(12, sq3.calculateDiameter());
    }

}
