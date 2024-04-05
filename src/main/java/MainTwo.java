import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class MainTwo {
    public static void main(String[] args) throws IOException {
/*        try {
            List<String> listString = Files.readAllLines(Paths.get(
                    "C:\\Users\\279014857\\IdeaProjects\\stream-api-airport-master\\Files\\data\\info.txt"));

            PrintWriter printWriter = new PrintWriter(
                    "C:\\Users\\279014857\\IdeaProjects\\stream-api-airport-master\\Files\\data\\book.txt");
            for (String line : listString) {
                printWriter.write(line + "\n");
            }

            printWriter.flush();
            printWriter.close();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }*/

        try {
            List<String> listString = Files.readAllLines(Paths.get(
                    "C:\\Users\\279014857\\IdeaProjects\\stream-api-airport-master\\Files\\data\\info.txt"));
            ArrayList<String> arrayList = new ArrayList<>();
            for (String line : listString) {
                arrayList.add(line);
            }
            Files.write(Paths.get(
                        "C:\\Users\\279014857\\IdeaProjects\\stream-api-airport-master\\Files\\data\\book.txt"),
                        arrayList);
            } catch (Exception ex) {
                ex.getMessage();
            }
        }
    }

