package entites;

public class ComboDevice extends Device implements Printer, Scanner {

  public ComboDevice(String serialNumber) {
    super(serialNumber);
  }

  @Override
  public String scan() {
    return "Scanned content";
  }

  @Override
  public void print(String doc) {
    System.out.println("Printer processing: " + doc);
  }

  @Override
  public void processDoc(String doc) {
    System.out.println("Combo processing: " + doc );
  }

}
