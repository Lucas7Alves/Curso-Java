import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entites.Employee;

public class Program {
  public static void main(String[] args) {
    List<Employee> list = new ArrayList<>();
    String path = "C:\\Users\\lucas\\OneDrive\\Desktop\\in.txt";

    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
 
      String emp = br.readLine();
      while (emp != null) {
        String[] employeeCsv = emp.split(",");
        list.add(new Employee(employeeCsv[0], Double.parseDouble(employeeCsv[1])));
        emp = br.readLine();
      }
      Collections.sort(list);
      for (Employee employee : list) {
        System.out.println(employee.getName() + ", " + employee.getSalary());
      }
    } catch (IOException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
}