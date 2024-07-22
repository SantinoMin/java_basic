package Exam.src.ExceptionHandling0722;

import java.io.IOException;

public class ExceptionTest8 {

  public static void func() throws IOException, ClassCastException {
    //!! RuntimeException 제외하고 나머지는 넘겨줄 때, throws 필요 // 메서드 뒤에.

    int n = 2;
    if (n == 2){
      throw new IOException("입출력 제외");
//    throw new Exception("내가 만든 강제 예외");
//  throw new RuntimeException("내가 만든 강제 예외");
  }
    else if(n==3)

  {
    throw new ClassCastException("클래스 캐스트 예외");
  }
}

  public static void main(String[] args) {
//    func();
  }
}
