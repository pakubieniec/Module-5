import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    Triangle tr = new Triangle(8,4);
    Triangle tr2 = new Triangle(25,8);
    Triangle tr3 = new Triangle(32,9);

    @Test
    public void areaOfTheTriangleLength8AndHeight4ShouldReturn16(){
        Assertions.assertEquals(16, tr.calculateArea());
    }
    @Test
    public void areaOfTheTriangleLength25AndHeight8ShouldReturn100(){
        Assertions.assertEquals(100, tr2.calculateArea());
    }
    @Test
    public void areaOfTheTriangleLength32AndHeight9ShouldReturn144(){
        Assertions.assertEquals(144, tr3.calculateArea());
    }
}
