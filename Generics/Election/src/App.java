import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            Map <String, Integer> map = new HashMap<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String key = fields[0];
                Integer value = Integer.parseInt(fields[1]);
                if (map.containsKey(key)) {
                    Integer oldValue = map.get(key);
                    map.put(key, oldValue + value);
                } else {
                    map.put(key, value);
                }

                line = br.readLine();
            }
            for (String keys : map.keySet()) {
                System.out.println(keys + ": " + map.get(keys));
            }

        } catch (Exception e) {
            
        }
        sc.close();
    }
}
