import java.io.File;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter with the path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);

        for (File f : folders) {
            System.out.println(f);
        }

        File[] file = path.listFiles(File::isFile);

        for (File f : file) {
            System.out.println(f);
        }

        boolean result = new File(strPath + "\\newFolder").mkdir();
        System.out.println("New folder created: " + result);
    }
}
