package Exam.src.examClass;

class Account {

  String id;
  String name;
  int balance;

  String info() {
    return String.format("계좌번호:%s, 이름:%s, 잔액:%d", id, name, balance);
  }
  //void는 함수 앞에서만 올 수 있음
  void deposit(int money){
      balance += money;
    };
  void withdrawal(int money){
    balance -= money;
  };

  public static class ClassTest2 {

    public static void main(String[] args) {

      Account first = new Account();
      first.id = "10001";
      first.name = "홍길동";
      first.balance = 100000;

      Account second = new Account();
      second.id = "10002";
      second.name = "김길동";
      second.balance = 200000;

      Account third = new Account();
      third.id = "10003";
      third.name = "고길동";
      third.balance = 300000;

      System.out.println(first.info());
      System.out.println(second.info());
      System.out.println(third.info());


      //함수는 () 괄호가 있음

      first.deposit(10000);  // 입금
      second.withdrawal(10000); // 출금
      System.out.println(first.info());
      System.out.println(second.info());
    }
  }
};

// 계좌번호: 10001, 이름:홍길동, 잔액: 100,000
// 계좌번호: 10002, 이름:김길동, 잔액: 200,000
// 계좌번호: 10003, 이름:고길동, 잔액: 300,000

// 계좌번호: 10001, 이름:홍길동, 잔액: 110,000
// 계좌번호: 10002, 이름:김길동, 잔액: 190,000