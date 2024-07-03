package entites;

public class BusinessAccount extends Account {
 
  private Double loanLimt;

  public BusinessAccount() {
    super();
  }

  //constructors
  public BusinessAccount(Integer number, String holder, Double balance, Double loanLimt) {
    super(number, holder, balance);
    this.loanLimt = loanLimt;
  }

  //metodos
  public void loan(double amount) {
    if (amount <= loanLimt) {
      balance += amount -10.0;
    }
  }

  public void withdrawn(Double amount) {
    super.withdrawn(amount);
    balance -= 2.0;
  }

  //getters and setters
  public Double getLoanLimt() {
    return loanLimt;
  }

  public void setLoanLimt(Double loanLimt) {
    this.loanLimt = loanLimt;
  }
  
}
