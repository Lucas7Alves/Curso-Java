import java.io.BufferedReader;
import java.io.FileReader;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entites.LogEntry;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter with the file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            
            Set<LogEntry> set = new HashSet<>();

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(" ");
                String name = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                set.add(new LogEntry(name, moment));   
                line = br.readLine(); 
            }
            System.out.print("Total users: " + set.size());
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
