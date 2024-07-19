import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* Forma mais enxuta de trabalhar */
public class App {
    public static void main(String[] args) throws Exception {
        
        String path = "C:\\Users\\lucas\\OneDrive\\Desktop\\Tralha\\Gamepass.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();

            while (br.readLine() != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } 
    }
}
