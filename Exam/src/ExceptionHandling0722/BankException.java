package Exam.src.ExceptionHandling0722;

public class BankException extends Exception {

  private final BankErr ERR_CODE;

  public BankException(String msg, BankErr code){
    super(msg);
    ERR_CODE = code;
  }
  public BankErr getErrCode(){
    return ERR_CODE;
  }

  //!!어디꺼 Override? Exception에서?
  @Override
  public String toString(){
    String message= getMessage();
        switch(ERR_CODE) {
          case NOTACCID:
            message += ": 계좌번호 오류입니다";
            break;
          case EXEACCID:
            message += ": 계좌번호가 중복됩니다.";
            break;
          case NOTBALANCE:
            message += ": 잔액이 부족합니다..";
            break;
          case DEPOSIT:
            message += "입금 오류입니다";
            break;
          case BANKMENU:
            message += "0~5까지의 메뉴만 선택하세요";
            break;
          case MAKEACCMENU: message += "1-2 메뉴만 선택하세요"; break;
        }
        return message;
  }
}