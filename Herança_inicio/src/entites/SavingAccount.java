package entites;

public class SavingAccount extends Account{
  private Double interestRate;

  //constructors
  public SavingAccount(){
    super();
  }

  public SavingAccount(Integer number, String holder, Double balance, Double interestRate) {
    super(number, holder, balance);
    this.interestRate = interestRate;
  }

  //metodos
  public void updateBalance() {
    balance += balance * interestRate;
  }

  @Override
  public void withdrawn(Double amount) {
    balance -= amount;
  }

  //getters and setters
  public Double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(Double interestRate) {
    this.interestRate = interestRate;
  }

  
}
