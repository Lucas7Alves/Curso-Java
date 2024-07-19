import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        
        String[] lines = new String[] {"SpringBoot", "Docker", "JUnit"};
        String path = "C:\\Users\\lucas\\OneDrive\\Desktop\\Tralha\\Cursos-extras.txt";

        try (BufferedWriter br = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                br.write(line);
                br.newLine();
            }
        } catch (IOException e) {
            e.getStackTrace();
        }
    }
}
