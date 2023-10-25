import java.io.*;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SortedMap;

public class InvertFile {

    FileReader fr = null;
    FileWriter fw = null;
    Scanner scanner = new Scanner(System.in);

    public boolean invertFile(String filepath) {
        File file = new File(filepath);
        try {
            if (file.exists()) {
                fr = new FileReader(filepath);
                System.out.println("Podaj ścieżkę, gdzie chcesz zapisać plik: ");
                String writingFile = scanner.nextLine();

                fw = new FileWriter(writingFile);

                int i;
                String str = "";
                while ((i = fr.read()) != -1) {
                    System.out.print((char) i);
                    str += (char) i;
                }

                System.out.print(str);

                String s[]
                        = str.split(" ");
                String ans = "";
                for (int j = s.length - 1; j >= 0; j--) {
                    ans += s[j] + " ";
                }

                System.out.println(
                        ans.substring(0, ans.length() - 1));

                fw.write(ans);


                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return false;
    }


}