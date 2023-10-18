import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    Rectangle rec =new Rectangle(32,9);
    Rectangle rec2 =new Rectangle(4,9);
    Rectangle rec3 =new Rectangle(125,9);

    @Test
    public void areaOfTheRectangle32And9ShouldReturn288(){
        Assertions.assertEquals(288, rec.calculateArea());
    }
    @Test
    public void areaOfTheRectangle4And9ShouldReturn36(){
        Assertions.assertEquals(36, rec2.calculateArea());
    }
    @Test
    public void areaOfTheRectangle125And9ShouldReturn1125(){
        Assertions.assertEquals(1125, rec3.calculateArea());
    }

}
