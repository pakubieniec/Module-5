import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    Triangle tr = new Triangle();

    @Test
    public void areaOfTheTriangleLength8AndHeigh4ShouldReturn16(){
        Assertions.assertEquals(16, tr.calculateArea(8.0,4.0));
    }
    @org.junit.Test
    public void areaOfTheTriangleLength25AndHeigh8ShouldReturn110(){
        Assertions.assertEquals(100, tr.calculateArea(25.0,8.0));
    }
    @org.junit.Test
    public void areaOfTheTriangleLength32AndHeigh9ShouldReturn144(){
        Assertions.assertEquals(144, tr.calculateArea(32.0,9.0));
    }
}
