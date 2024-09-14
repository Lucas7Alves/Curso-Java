import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        String path = "C:\\Users\\lucas\\OneDrive\\Desktop\\in.txt";
        String line = "";
        List<Employee> list = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                Employee emp = new Employee(fields[0], fields[1], Double.parseDouble(fields[2]));
                list.add(emp);
                line = br.readLine();
            }
            System.out.println("Enter salary: ");
            double salary = sc.nextDouble();
            System.out.println("Email of salary is more than " + salary + ":");

            List<String> emailList = list.stream()
                    .filter(x -> x.getSalary() > salary)
                    .map(x -> x.getEmail())
                    .sorted()
                    .collect(Collectors.toList());

            emailList.forEach(System.out::println);
            double sum = list.stream()
                    .filter(x -> x.getName().charAt(0) == 'M')
                    .map(x -> x.getSalary())
                    .reduce(0.0, (x, y) -> x + y);
            System.out.println("Sum of salary of people whose name starts with 'M': "+sum);
        } catch (Exception e) {
            e.getStackTrace();
        }
        sc.close();
    }
}
