import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {
    Square sq = new Square();

    @Test
    public void DiameterOfSquare5And4ShouldReturn40() {
        Assertions.assertEquals(40, sq.calculateDiameter(5, 4));
    }
    @Test
    public void DiameterOfSquare21And6ShouldReturn252() {
        Assertions.assertEquals(252, sq.calculateDiameter(21, 6));
    }
    @Test
    public void DiameterOfSquare3And15ShouldReturn90() {
        Assertions.assertEquals(90, sq.calculateDiameter(3, 15));
    }

}
