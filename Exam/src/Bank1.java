//package Exam.src;
//
//import Exam.src.BankProj.Account;
//import Exam.src.ExceptionHandling0722.BankErr;
//import Exam.src.ExceptionHandling0722.BankException;
//import Exam.src.specialAcc.SpecialAccount;
//import java.util.Scanner;
//
//public class Bank1 {
//
//  Scanner sc = new Scanner(System.in);
//  Account[] accs = new Account[100];
//  int cnt; //처음에는 0으로 초기화 됨.
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
//    if (sel < 0 || sel > 5) {
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
//    switch (sel) {
//      case 1:
//        makeAccount();
//        break;
//      case 2:
//        makeSpecialAccount();
//        break;
//      default : throw new BankException("메뉴 오류", BankErr.BANKMENU);
//    }
//  }
//
//
//  void makeAccount() throws BankException {
//    System.out.println("[일반계좌개설]");
//    System.out.print("계좌번호:");
//    String num = sc.nextLine();
//
//    if (searchAccByNum(num) != null) {
//      throw new BankException("계좌 개설 오류", BankErr.EXEACCID);
//    }
//
//    System.out.print("이름:");
//    String name = sc.nextLine();
//    System.out.print("입금액:");
//    int money = Integer.parseInt(sc.nextLine());
//
//    accs[cnt++] = new Account(num, name, money);
//  }
//
//
//  ;
//
////!!여기서 Integer.parseInt를 사용하는 이유는? --> sc.nextLine()은 콘솔에서 입력된 한 줄의 문자열을 반환함.
////--> 그래서 Money 즉, 정수형인 금액으로 받아야 되기 때문에 Integer.parseInt 사용함.
//
//
//  void makeSpecialAccount() throws BankException{
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
//  //!!
//  Account searchAccByNum(String num) {
//    Account acc = null;
//    for (int i = 0; i < cnt; i++) {
//      if (accs[i].getNum().equals(num)) {
//        acc = accs[i];
//        break;
//      }
//    }
//    return acc;
//  }
//
//
//  // [계좌계설]후에 accs[0]번에 입금을 하려면, money의 값만 업데이트 시켜주면 되는건지?
//  void deposit() throws BankException{
//    System.out.println("[입력]");
//    System.out.print("계좌번호:");
//    String num = sc.nextLine();
//    System.out.print("입금액:");
//    int money = Integer.parseInt(sc.nextLine());
//    Account acc = searchAccByNum(num);
//    if (acc == null) {
//      throw new BankException("계좌오류", BankErr.NOTACCID);
////      System.out.println("계좌번호가 틀립니다.");
////      return;
//    }
//    acc.deposit(money);
//  }
//
//  void withdraw() throws BankException{
//    System.out.println("[출금]");
//    System.out.print("계좌번호:");
//    String num = sc.nextLine();
//    System.out.print("출금액:");
//    int money = Integer.parseInt(sc.nextLine());
//
//    Account acc = searchAccByNum(num);
//    if (acc == null) {
//      throw new BankException("계좌오류", BankErr.NOTACCID);
//
////      System.out.println("계좌번호가 틀립니다.");
////      return;
//    }
//    acc.withdraw(money);
//  }
//
//
//  ;
//
//  void accountInfo() {
//    System.out.println("[계좌조회]");
//    System.out.println("계좌번호: ");
//    String num = sc.nextLine();
//    Account acc = searchAccByNum(num);
//    if (acc == null) {
//      System.out.println("계좌번호가 틀립니다.");
//      return;
//    }
//    System.out.println(acc.info());
//  }
//
//  void allAccountInfo() {
//    System.out.println("[전체계좌조회]");
//    for (int i = 0; i < cnt; i++) {
//      System.out.println(accs[i].info());
//    }
//  }
//
//  public static void main(String[] args) {
//    Bank1 bank = new Bank1();
//
//    int sel;
//
//    while (true) {
//      try {
//        sel = bank.selectMenu();
//        if (sel == 0) {
//          System.out.println("0 = 종료");
//          break;
//        }
//
//        switch (sel) {
//          case 1:
//            bank.makeAccount();
//            bank.makeSpecialAccount();
//            break;
//          case 2:
//            bank.deposit();
//            break;
//          case 3:
//            bank.withdraw();
//            break;
//          case 4:
//            bank.accountInfo();
//            break;
//          case 5:
//            bank.allAccountInfo();
//            break;
//        }
//      }catch(NumberFormatException e){
//          System.out.println("입력 형식이 맞지 않습니다.");
//        } catch(BankException e){
//          System.out.println(e.toString());
//        }
//      };
//    }
//  };
