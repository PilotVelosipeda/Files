import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/*        File file = new File("data\\info.txt");
        System.out.println(file.length());
        System.out.println(file.getAbsoluteFile());*/

/*        File folder = new File("C:\\Users\\279014857\\IdeaProjects");
        File[] listFiles = folder.listFiles();
        for (File currentFile : listFiles) {
            System.out.println(currentFile.getName());
        }

        File fileNumber = new File(
                "C:\\Users\\279014857\\IdeaProjects\\stream-api-airport-master\\Files\\data\\animals");
*//*        fileNumber.mkdir();*//*
        fileNumber.delete();*/

/*        StringBuilder builder = new StringBuilder();
        try {
            FileInputStream is = new FileInputStream(
                    "C:\\Users\\279014857\\IdeaProjects\\stream-api-airport-master\\Files\\data\\info.txt");
            for (;;) {
                int code = is.read();
                if (code == -1) {
                    break;
                }
                char ch = (char) code;
                builder.append(ch);
            }
        } catch (IOException ex) {
            ex.getMessage();
        }
        System.out.println(builder.toString());*/

/*        StringBuilder builder = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader(
                            "C:\\\\Users\\\\279014857\\\\IdeaProjects\\\\stream-api-airport-master\\\\Files\\\\data\\\\info.txt"));
            for (;;) {
                String str = br.readLine();
                if (str == null) {
                    break;
                }
                builder.append(str + "\n");
            }
        } catch (Exception ex) {
            ex.getMessage();
            }
        System.out.println(builder.toString());*/
/*        try {
            StringBuilder builder = new StringBuilder();
            List<String> listStrings = Files.readAllLines(
                    Paths.get(
                            "C:\\Users\\279014857\\IdeaProjects\\stream-api-airport-master\\Files\\data\\info.txt"));
            System.out.println("Title file: " + listStrings.getFirst());
            listStrings.forEach(line -> builder.append(line + "\n"));
            System.out.println(builder.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        */
/*        try {
                byte[] arrayBytes = Files.readAllBytes(Paths.get(
                        "C:\\Users\\279014857\\IdeaProjects\\stream-api-airport-master\\Files\\data\\info.txt"));
                for (byte b : arrayBytes) {
                    System.out.println((char) b);
                }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }*/
    }
}

