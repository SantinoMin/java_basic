package Exam.src.ExceptionHandling0722;

public class ExceptionTest7 {

  //finally를 작성해야 중간에 return을 입력해도 끝까지 실행됨.

  public static void func() {
    try {
      String str = "string";
//      String str = null;

      System.out.println("스타트");
      System.out.println(str.toCharArray());
      return;
//      System.out.println("마무리");
    } catch (MyException e) {
      System.out.println("예외 처리");
//      System.out.println("catch에서 마무리");
      return;
    }finally {
      System.out.println("마무리");
    }
  }

  public static void main(String[] args) {
    func();
  }
}
