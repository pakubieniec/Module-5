import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class PrintDirectory {
    public void printDirectory(File directoryPath) {
        File filesList[] = directoryPath.listFiles();
        System.out.println("List of files and directories in the specified directory:");
//        Scanner sc = null;
//        StringBuffer sb = new StringBuffer();
        for (File file : filesList) {
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("Size :" + file.getTotalSpace());
        }

    }
}
