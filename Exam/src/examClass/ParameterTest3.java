package Exam.src.examClass;

class Data {

  int x;
}

public class ParameterTest3 {

  public static void main(String[] args) {

    Data d = new Data();
    d.x = 10;
    System.out.println("main() : x = " + d.x); //

    change(d);
    System.out.println("After change()");
    System.out.println("main() : x = " + d.x);
  }

  static void change(Data d) {
    d.x = 1000;
    System.out.println("change() : x = " + d.x);
  }
//  예상 출력
//10
//1000
//after..
//10 --> 1000임 // Data타입 안의 값이 수정되었기 때문.
}
