import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class PrintDirectory {

    public static void main(String args[]) {

        printDirectory(new File("C:\\Users\\Patty\\Documents\\NetBeansProjects\\Mod-5"));

            //Instantiating the Scanner class
//            sc= new Scanner(file);
//            String input;
//            while (sc.hasNextLine()) {
//                input = sc.nextLine();
//                sb.append(input+" ");
//            }
//            System.out.println("Contents of the file: "+sb.toString());
//            System.out.println(" ");
//            //Instantiating the FileOutputStream class
//            FileOutputStream fileOut = new FileOutputStream("E:\\Angielski Pawlikowska");
//            //Instantiating the DataOutputStream class
//            DataOutputStream outputStream = new DataOutputStream(fileOut);
//            //Writing UTF data to the output stream
//            outputStream.write(sb.toString().getBytes());
//            outputStream.flush();
//            System.out.println("Data entered into the file");
        }

    public static void printDirectory(File directoryPath) {
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
