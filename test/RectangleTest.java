import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    Rectangle rec =new Rectangle();

    @Test
    public void areaOfTheRectangle32And9ShouldReturn288(){
        Assertions.assertEquals(288, rec.calculateArea(32,9));
    }
    @Test
    public void areaOfTheRectangle4And9ShouldReturn36(){
        Assertions.assertEquals(36, rec.calculateArea(4,9));
    }
    @Test
    public void areaOfTheRectangle125And9ShouldReturn1125(){
        Assertions.assertEquals(1125, rec.calculateArea(125,9));
    }

}
