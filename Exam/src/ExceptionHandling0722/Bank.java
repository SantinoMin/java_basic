//package Exam.src.ExceptionHandling0722;
//
//public class Bank {
//
//  public static void accInfo() throws BankException{
//    throw new BankException("계좌오류", BankErr.NOTACCID);
//  }
//
//  public static void menu() throws BankException{
//    throw new BankException("메뉴 선택", BankErr.BANKMENU);
//  }
//
//  public static void deposit() throws BankException{
//    throw new BankException("잔액 부족",  BankErr.DEPOSIT);
//  }
//
//  public static void main(String[] args) {
//    try {
////      throw new BankException("계좌오류", BankErr.NOTACCID);
////      accInfo();
//      menu();
//    } catch (BankException e) {
//      System.out.println(e.toString());
//    }
//  }
//}
