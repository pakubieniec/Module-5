import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class HexagonTest {
    Hexagon hex = new Hexagon(10);
    Hexagon hex2 = new Hexagon(7);
    Hexagon hex3 = new Hexagon(3);

    @Test
    public void areaOfTheHexagon10ShouldReturn259(){
        Assertions.assertEquals(259, hex.calculateArea());
    }
    @Test
    public void areaOfTheHexagon7ShouldReturn127(){
        Assertions.assertEquals(127, hex2.calculateArea());
    }
    @Test
    public void areaOfTheHexagon3ShouldReturn23(){
        Assertions.assertEquals(23, hex3.calculateArea());
    }

}

