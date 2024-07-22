package Exam.src.specialAcc;


import Exam.src.ExceptionHandling0722.BankErr;
import Exam.src.ExceptionHandling0722.BankException;

public class Account {
  String AccNum;
  String name;
  int balance;

  Account(String AccNum, String name, int balance){
      this.AccNum = AccNum;
      this.name = name;
      this.balance = balance;

  }

  public String getAccNum() {
    return AccNum;
  }

  public void setAccNum(String accNum) {
    AccNum = accNum;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public void deposit(int money) throws BankException {
    if(money<=0) throw new BankException("입금오류", BankErr.DEPOSIT);
    balance += money;
  }


}
