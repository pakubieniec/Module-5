import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class FilesEquals {

    public boolean areTextFilesEqual(String filePath1, String filePath2) {
        try {
            if (Files.size(Path.of(filePath1)) != Files.size(Path.of(filePath2))) {
                return false;
            }

            byte[] first = Files.readAllBytes(Path.of(filePath1));
            byte[] second = Files.readAllBytes(Path.of(filePath2));
            return Arrays.equals(first, second);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    ;
}
