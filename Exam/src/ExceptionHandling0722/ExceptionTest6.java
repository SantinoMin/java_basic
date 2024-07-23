package Exam.src.ExceptionHandling0722;

public class ExceptionTest6 {

  public static void main(String[] args) {

    //!! 부모 클래스 (Exception이 마지막에 와야함 // 예외 catch 받을 때, 순서가 중요함)
    //!! 자식 예외 catch부터 와야함(작은 부분부터 확인)
    try {

    } catch (NullPointerException e) {
    } catch (ArithmeticException e) {
    } catch (NumberFormatException e) {
//    } catch (MyException e) {

    }

  }
}
