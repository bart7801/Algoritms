package ParserCSV;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class App {

    public static Path file = Paths.get("ParserCSVdatas.csv");

    public static void main(String[] args) {

        try {
            byte[] lines2 = Files.readAllBytes(file);
            List<String> lines = Files.readAllLines(file);
            System.out.println(lines);

            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}