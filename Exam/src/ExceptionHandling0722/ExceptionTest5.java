package Exam.src.ExceptionHandling0722;

public class ExceptionTest5 {


  //실행 순서 이해하기.
  public static void func(){
    String str = null;
    try {
      System.out.println(str.toString());
    } catch ( NullPointerException e ) {
      System.out.println("func 예외처리");
      throw e;
    }
    System.out.println("func 종료");
  }

  public static void func2(){
    try {
      func();
    } catch( NullPointerException e ) {
      System.out.println("func2 예외 처리");
    }
    System.out.println("func2 종료");
  }

  public static void main(String[] args) {
    func2();
    System.out.println("main 종료");
  }
}
