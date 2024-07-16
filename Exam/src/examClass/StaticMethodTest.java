package Exam.src.examClass;

class Test {

  int iv;
  static int sv;

  void method1() {
    System.out.println("method1");
    iv = 100;
    sv = 200; // instance 메서드에서는 static 변수를 사용할 수 있다.
    method2(); // instance 메서드에서는 static 함수를 호출할 수 있다.
  }

  static void method2() {
    System.out.println("method2");

    //이거 차이 알아야 될듯
    //!!스태틱 변수랑 인스턴스 변수의 차이점
//    System.out.println(iv); !!! static 매서드에서는 instance 변수를 사용할 수 없다.
//    method1(); // static 메서드에서는 instance 메소드를 호출 할 수 없다.
    method2();

    System.out.println(sv);
  }
};

//static은 어디서든 사용 가능?

public class StaticMethodTest {

  public static void main(String[] args) {

    Test.method2();

//    Test.method1(); // 이거 인스턴스 생성 안해주면 안 됨.
    Test t = new Test();
    t.method1();

  }
}
