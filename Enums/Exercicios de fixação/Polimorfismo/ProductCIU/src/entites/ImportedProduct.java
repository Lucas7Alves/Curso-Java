package entites;

public class ImportedProduct extends Product{

  private Double customsFee;

  //ctc
  public ImportedProduct() {
  }
  public ImportedProduct(String name, Double price, Double customsFee) {
    super(name, price);
    this.customsFee = customsFee;
  }

  //metodos
  

  @Override
  public String priceTag() {
    return getName() + " $ " + String.format("%.2f", totalprice()) + "(Customs fee: " + String.format("%.2f", getCustomsFee()) +")";
  }

  public Double totalprice() {
    return getPrice() + customsFee;
  }
  //gt & st
  public Double getCustomsFee() {
    return customsFee;
  }
  public void setCustomsFee(Double customsFee) {
    this.customsFee = customsFee;
  }

  
}
