package Exam.src.acc;

import Exam.src.BankProj.Account;
import java.util.Scanner;

//다른 패키지 클래스의 정보를 가져오려면, public을 설정 해주고,
//getter, setter를 통해서 값을 가져온다.
public class Bank {

  Account[] accs = new Account[100];
  int cnt; //처음에는 0으로 초기화 됨.


  Scanner sc = new Scanner(System.in);

  int selectMenu() {
    System.out.println("[코스타 은행]");
    System.out.println("0. 종료");
    System.out.println("1. 계좌개설");
    System.out.println("2. 입금");
    System.out.println("3. 출금");
    System.out.println("4. 계좌조희");
    System.out.println("5. 전체계좌조희");
    System.out.println(">>");

    return Integer.parseInt(sc.nextLine());

  }

  void makeAccount() {
    System.out.println("[계좌개설]");
    System.out.print("계좌번호:");
    String num = sc.nextLine();
    System.out.print("이름: ");
    String name = sc.nextLine();
    System.out.print("입금액: ");
    int money = Integer.parseInt(sc.nextLine());

    //!!여기서 Integer.parseInt를 사용하는 이유는? --> sc.nextLine()은 콘솔에서 입력된 한 줄의 문자열을 반환함.
    //--> 그래서 Money 즉, 정수형인 금액으로 받아야 되기 때문에 Integer.parseInt 사용함.

//    Account[] accs = new Account[100]; // 여기에 할당 됨.
    accs[cnt++] = new Account(num, name, money);
  }

  //!!
  Account searchAccByNum(String num) {
    Account acc = null;
    for (int i = 0; i < cnt; i++) {
      if (accs[i].getNum().equals(num)) {
        acc = accs[i];
        break;
      }
    }
    return acc;
  }


  // [계좌계설]후에 accs[0]번에 입금을 하려면, money의 값만 업데이트 시켜주면 되는건지?
  void deposit() {
    System.out.println("[계좌번호]");
    System.out.print("계좌번호: ");
    String num = sc.nextLine();

    System.out.println("[입금]");
    System.out.print("입금액: ");
    int money = Integer.parseInt(sc.nextLine());
    Account acc = searchAccByNum(num);
    if (acc == null) {
      System.out.println("계좌번호가 틀립니다.");
      return;
    }
    acc.deposit(money);

    //계좌 배열에서 아이디 같은 값 찾고 --> 입금 처리
  }

  void withdraw() {
    System.out.println("[출금]");
    System.out.println("계좌번호: ");
    String num = sc.nextLine();

    System.out.println("출금액");
    int money = Integer.parseInt(sc.nextLine());

    Account acc = searchAccByNum(num);
    if (acc == null) {
      System.out.println("계좌번호가 틀립니다.");
      return;
    }
    acc.withdraw(money);
  }

  ;

  void accountInfo() {
    System.out.println("[계좌조회]");
    System.out.println("계좌번호: ");
    String num = sc.nextLine();
    Account acc = searchAccByNum(num);
    if (acc == null) {
      System.out.println("계좌번호가 틀립니다.");
      return;
    }
    System.out.println(acc.info());
  }

  void allAccountInfo() {
    System.out.println("[전체계좌조회]");
    for (int i = 0; i < cnt; i++) {
      System.out.println(accs[i].info());
    }
  }


  public static void main(String[] args) {
    Bank bank = new Bank();

    int sel;

    while (true) {
      sel = bank.selectMenu();
      if (sel == 0) {
        System.out.println("0 = 종료");
        break;
      }

      switch (sel) {
        case 1:
          bank.makeAccount();
          break;
        case 2:
          bank.deposit();
          break;
        case 3:
          bank.withdraw();
          break;
        case 4:
          bank.accountInfo();
          break;
        case 5:
          bank.allAccountInfo();
          break;
      }
    }
  }
}

