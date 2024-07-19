import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* Modo muito verboso, essa atividade serve para ver a forma de fechar manualmente as streams */
public class App {
    public static void main(String[] args) throws Exception {
        
        String path = "C:\\Users\\lucas\\OneDrive\\Desktop\\Tralha\\Gamepass.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();

            while (br.readLine() != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fr !=  null) {
                    fr.close();
                }
                if (br != null) {
                    br.close();
                }
            } catch (Exception e) {
                e.getStackTrace();
            }
        }
    }
}
