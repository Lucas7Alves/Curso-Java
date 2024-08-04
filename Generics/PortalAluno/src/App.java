import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        try {
            Set<Student> set = new HashSet<>();
            System.out.print("How many students for course A? ");
            int total = sc.nextInt();
            for (int i = 0; i < total; i++) {
                set.add(new Student(sc.nextInt()));
            }

            System.out.print("How many students for course B? ");
            total = sc.nextInt();
            for (int i = 0; i < total; i++) {
                set.add(new Student(sc.nextInt()));
            }

            System.out.print("How many students for course C? ");
            total = sc.nextInt();
            for (int i = 0; i < total; i++) {
                set.add(new Student(sc.nextInt()));
            }

            System.out.println("Total students: " + set.size());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
