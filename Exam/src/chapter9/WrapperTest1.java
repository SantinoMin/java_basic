package Exam.src.chapter9;

public class WrapperTest1 {

  public static void main(String[] args) {

    //10이 들어가는게 아니라, 주소를 가지고 있는거
    Integer n = 10; // boxing
    Double d = 3.14; // boxing

    int m = n; // 타입이 wrapper클래스인 경우(n) unboxing

//    m = null; // 안 들어가짐 // Error
    n = null; // 들어가짐


  }
}
