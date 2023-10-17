import org.junit.Test;
import org.junit.jupiter.api.Assertions;
public class CalculateAreaTest {
    CalculateArea ca = new CalculateArea();

    @Test
    public void areaOfTheTriangleLength8AndHeigh4ShouldReturn16(){
        Assertions.assertEquals(16, ca.calculateArea(8.0,4.0));
    }
    @Test
    public void areaOfTheTriangleLength25AndHeigh8ShouldReturn110(){
        Assertions.assertEquals(100, ca.calculateArea(25.0,8.0));
    }
    @Test
    public void areaOfTheTriangleLength32AndHeigh9ShouldReturn144(){
        Assertions.assertEquals(144, ca.calculateArea(32.0,9.0));
    }

    @Test
    public void areaOfTheRectangle32And9ShouldReturn288(){
        Assertions.assertEquals(288, ca.calculateArea(32,9));
    }
    @Test
    public void areaOfTheRectangle4And9ShouldReturn36(){
        Assertions.assertEquals(36, ca.calculateArea(4,9));
    }
    @Test
    public void areaOfTheRectangle125And9ShouldReturn1125(){
        Assertions.assertEquals(1125, ca.calculateArea(125,9));
    }

    @Test
    public void areaOfTheHexagon10ShouldReturn259Dot8(){
        Assertions.assertEquals(259.8, ca.calculateArea(10));
    }
    @Test
    public void areaOfTheHexagon7ShouldReturn127Dot3(){
        Assertions.assertEquals(127.3, ca.calculateArea(7));
    }
    @Test
    public void areaOfTheHexagon3ShouldReturn23Dot4(){
        Assertions.assertEquals(23.4, ca.calculateArea(3));
    }
}
