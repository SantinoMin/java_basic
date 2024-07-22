package Exam.src.ExceptionHandling0722;

public enum BankErr {
  NOTACCID, //계좌번호 없음
  EXEACCID, // 계좌번호 이미 존재
  NOTBALANCE, // 잔액 부족
  DEPOSIT, // 입금 이상
  WITHDRAW, // 출금 이상
  BANKMENU, // 메뉴 이상
  MAKEACCMENU, // 계좌 개설 메뉴

}
