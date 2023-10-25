import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilesEqualsTest {

    FilesEquals filesEquals = new FilesEquals();

    @Test
    public void contentTestFileAndTestFile2ShouldReturnTrue(){
        Assertions.assertEquals(true, filesEquals.areTextFilesEqual("files//test.txt", "files//test2.txt"));
    }

    @Test
    public void contentTest3TxtAndTest4TxtShouldReturnFalse(){
        Assertions.assertEquals(false, filesEquals.areTextFilesEqual("files//test3.txt", "files//test4.txt"));
    }

    @Test
    public void contentTest4TxtAndTest5TxtShouldReturnTrue(){
        Assertions.assertEquals(true, filesEquals.areTextFilesEqual("files//test4.txt", "files//test5.txt"));
    }
}
