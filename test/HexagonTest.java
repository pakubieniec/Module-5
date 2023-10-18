import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class HexagonTest {
    Hexagon hex = new Hexagon();

    @Test
    public void areaOfTheHexagon10ShouldReturn259Dot8(){
        Assertions.assertEquals(259.8, hex.calculateArea(10));
    }
    @Test
    public void areaOfTheHexagon7ShouldReturn127Dot3(){
        Assertions.assertEquals(127.3, hex.calculateArea(7));
    }
    @Test
    public void areaOfTheHexagon3ShouldReturn23Dot4(){
        Assertions.assertEquals(23.4, hex.calculateArea(3));
    }

}

