package entites;

public class Employee implements Comparable<Employee> {

  private String name;
  private Double salary;


  public Employee(String name, Double salary) {
    this.name = name;
    this.salary = salary;
  }

  @Override
  public int compareTo(Employee o) {
    return name.compareTo(o.getName());
    //trocar name por salary se quiser ordenar por salario
    // colocar um - depois do return torna a ordem decrescente
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  

}
