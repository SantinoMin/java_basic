//package Exam.src.ExceptionHandling0722;
//
//import Exam.src.BankProj.Account;
//import java.util.Scanner;
//
////import acc.Account;
////import acc.SpecialAccount;
////import exc.BankErr;
////import exc.BankException;
//
//public class Bank2 {
//  Scanner sc = new Scanner(System.in);
//  Account[] accs = new Account[100];
//  int cnt;
//
//  int selectMenu() throws BankException {
//    System.out.println("[코스타 은행]");
//    System.out.println("0. 종료");
//    System.out.println("1. 계좌개설");
//    System.out.println("2. 입금");
//    System.out.println("3. 출금");
//    System.out.println("4. 계좌조회");
//    System.out.println("5. 전체계좌조회");
//    System.out.print(">>");
//    int sel = Integer.parseInt(sc.nextLine());
//    if(sel<0 || sel>5) {
//      throw new BankException("메뉴오류", BankErr.BANKMENU);
//    }
//    return sel;
//  }
//
//  void selMakeAccount() throws BankException {
//    System.out.println("[계좌개설]");
//    System.out.println("1.일반계좌개설");
//    System.out.println("2.특수계좌개설");
//    System.out.print(">>");
//    int sel = Integer.parseInt(sc.nextLine());
//    switch(sel) {
//      case 1: makeAccount();break;
//      case 2: makeSpecialAccount(); break;
//    }
//  }
//
//  void makeAccount() throws BankException {
//    System.out.println("[일반계좌개설]");
//    System.out.print("계좌번호:");
//    String num = sc.nextLine();
//
//    if(searchAccByNum(num)!=null) {
//      throw new BankException("계좌오류", BankErr.EXEACCID);
//    }
//
//    System.out.print("이름:");
//    String name = sc.nextLine();
//    System.out.print("입금액:");
//    int money = Integer.parseInt(sc.nextLine());
//
//    accs[cnt++] = new Account(num,name,money);
//  }
//
//  void makeSpecialAccount() {
//    System.out.println("[특수계좌개설]");
//    System.out.print("계좌번호:");
//    String num = sc.nextLine();
//
//    if(searchAccByNum(num)!=null) {
//      System.out.println("계좌번호가 중복됩니다.");
//      return;
//    }
//
//    System.out.print("이름:");
//    String name = sc.nextLine();
//    System.out.print("입금액:");
//    int money = Integer.parseInt(sc.nextLine());
//    System.out.print("등급(VIP-V,Gold-G,Silever-S,Normal-N):");
//    String grade = sc.nextLine();
//    accs[cnt++] = new SpecialAccount(num,name,money,grade);
//  }
//
//  Account searchAccByNum(String num) {
//    Account acc = null;
//    for(int i=0; i<cnt; i++) {
//      if(accs[i].getNum().equals(num)) {
//        acc = accs[i];
//        break;
//      }
//    }
//    return acc;
//  }
//
//  void deposit() {
//    System.out.println("[입력]");
//    System.out.print("계좌번호:");
//    String num = sc.nextLine();
//    System.out.print("입금액:");
//    int money = Integer.parseInt(sc.nextLine());
//    Account acc = searchAccByNum(num);
//    if(acc==null) {
//      System.out.println("계좌번호가 틀립니다.");
//      return;
//    }
//    acc.deposit(money);
//  }
//
//  void withdraw() {
//    System.out.println("[출금]");
//    System.out.print("계좌번호:");
//    String num = sc.nextLine();
//    System.out.print("출금액:");
//    int money = Integer.parseInt(sc.nextLine());
//
//    Account acc = searchAccByNum(num);
//    if(acc==null) {
//      System.out.println("계좌번호가 틀립니다.");
//      return;
//    }
//
//    acc.withdraw(money);
//  }
//
//  void accountInfo() {
//    System.out.println("[계좌조회]");
//    System.out.print("계좌번호:");
//    String num = sc.nextLine();
//    Account acc = searchAccByNum(num);
//    if(acc==null) {
//      System.out.println("계좌번호가 틀립니다.");
//      return;
//    }
//    System.out.println(acc.info());
//  }
//
//  void allAccountInfo() {
//    System.out.println("[전체계좌조회]");
//    for(int i=0; i<cnt; i++) {
//      System.out.println(accs[i].info());
//    }
//  }
//
//  public static void main(String[] args) {
//    Bank bank = new Bank();
//
//    int sel;
//
//    while(true) {
//      try {
//        sel = bank.selectMenu();
//        if(sel==0) break;
//
//        switch(sel) {
//          case 1: bank.selMakeAccount(); break;
//          case 2: bank.deposit(); break;
//          case 3: bank.withdraw(); break;
//          case 4: bank.accountInfo(); break;
//          case 5: bank.allAccountInfo(); break;
//        }
//      } catch(NumberFormatException e) {
//        System.out.println("입력형식이 맞지 않습니다.");
//      } catch(BankException e) {
//        System.out.println(e.toString());
//      }
//    }
//  }
//}
//
//
//
//
