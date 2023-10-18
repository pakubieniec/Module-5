import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {
    Square sq = new Square(5,4);
    Square sq2 = new Square(21,6);
    Square sq3 = new Square(3,15);

    @Test
    public void DiameterOfSquare5And4ShouldReturn40() {
        Assertions.assertEquals(40, sq.calculateDiameter());
    }
    @Test
    public void DiameterOfSquare21And6ShouldReturn252() {
        Assertions.assertEquals(252, sq2.calculateDiameter());
    }
    @Test
    public void DiameterOfSquare3And15ShouldReturn90() {
        Assertions.assertEquals(90, sq3.calculateDiameter());
    }

}
