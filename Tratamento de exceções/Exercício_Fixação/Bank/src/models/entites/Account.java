package models.entites;

import models.Exceptions.DomainException;

public class Account {

  private Integer number;
  private String holder;
  private Double balance;
  private Double withdrawLimit;

  //constructors
  public Account() {
  }
  public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
    this.number = number;
    this.holder = holder;
    this.balance = balance;
    this.withdrawLimit = withdrawLimit;
  }

  //methods
  public void deposit(Double amount) throws DomainException{

      if (amount < 0) {
        throw new DomainException("Invalid number!");
      } else {
        this.balance += amount;
      }
  }

  public void withdraw(Double amount) throws DomainException {
    if (amount > withdrawLimit) {
      throw new DomainException("The amount exceeds withdraw limit!");
    } else if (amount > balance) {
      throw new DomainException("Not enough balance");
    } else {
      this.balance -= amount;
    }
  }

  // getters and setters
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public String getHolder() {
    return holder;
  }

  public void setHolder(String holder) {
    this.holder = holder;
  }

  public Double getBalance() {
    return balance;
  }

  public Double getWithdrawLimit() {
    return withdrawLimit;
  }

  public void setWithdrawLimit(Double withdrawLimit) {
    this.withdrawLimit = withdrawLimit;
  }

}
