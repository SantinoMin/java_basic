package Exam.src.examClass;


//class Data {
//
//  int x;
//}

public class ParameterTest {

  public static void main(String[] args) {

    Data d = new Data();
    d.x = 10;
    System.out.println(d.x); // 예상 : 10

    change(d.x); // 지역변수?

    System.out.println("After change(d.x)");
    System.out.println("main() : x = " + d.x); // dx:1000
    //!!20번 줄에 출력 1000인줄 알았는데, static은 실행 후 사라지므로 10임
  }

  static void change(int x) {
    x = 1000;
    System.out.println("change() : x = " + x); // 예상 : 1000;
  }
}
