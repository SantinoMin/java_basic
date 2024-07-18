package Exam.src.BankProj;



public class Account {
  String num;
  String name;
  int balance;

  public String getNum() {
    return num;
  }

  public void setNum(String num) {
    this.num = num;
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

  //!!생성자 만들어서 초기화 필요
  public Account(String num, String name, int money) {
    this.num = num;
    this.name = name;
    this.balance = money;
  }

  void deposit(int money){
//    this.balance = money; //이렇게 하는거 아님
    balance += money;
  };

public void withdraw(int money){
//    this.balance = money; //이렇게 하는거 아님
    balance -= money;
  }

  String info(){
    //여기 아래 3줄은 안 써도 됨 (왜 그런지 이해하기)
//    String accountNo = this.num;
//    String name = this.name;
//    int money = this.balance;
    return String.format("계좌번호:%s, 이름:%s, 잔액: %d", num,name,balance);
  };

  public static void main(String[] args) {
    Account acc1 = new Account("10001", "홍길동", 100000);
    System.out.println(acc1.info());
    acc1.deposit(10000);

    System.out.println(acc1.info());
    acc1.withdraw(5000);
    System.out.println(acc1.info());
  }
}

//계좌번호: 10001, 이름: 홍길동, 잔액: 100000
//계좌번호: 10001, 이름: 홍길동, 잔액: 100000