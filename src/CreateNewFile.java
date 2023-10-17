import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateNewFile {
    public static void main(String[] args) {
        writeUserInputToFile();
        readFromFile("files//test4.txt");
    }

    public static boolean writeUserInputToFile() {
        System.out.println("Podaj nazwe pliku ktory chcesz utworzyc");
        Scanner scanner = new Scanner(System.in);
        String fileName = "files//" + scanner.nextLine();

        File file = new File(fileName);
        try {
            if (!file.exists()) {
                boolean fileCreated = file.createNewFile();
                System.out.println("Wynik utworzenia pliku: " + fileCreated);
                System.out.println("Sukkces");
                System.out.println("Napisz co chcesz zapisac w pliku");
                String str = scanner.nextLine();
                char[] chars = str.toCharArray();
                FileWriter fw = null;
                try {
                    fw = new FileWriter(fileName);
                    for (char c : chars) {
                        fw.write(c);

                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (fw != null) fw.close();
                }

            } else {
                System.out.println("Taki plik juz istnieje");
                System.out.println("Nie udało się utworzyć pliku o takiej nazwie");

                return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    public static void readFromFile(String fileName) {
        FileReader fr = null;
        try {
            int num = 0;
            fr = new FileReader(fileName);
            while ((num = fr.read()) != -1) {
                System.out.print((char) num);
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
        }
    }
}
