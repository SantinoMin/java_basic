package Exam.src.examClass;

class Variable {
  int iv;
  static int sv; // static변수는 new없이도 가능 // class변수로
  void method(){
    int lv=0;

    //지역 변수는 초기화하지 않으면, 사용할 수 없다.
//    System.out.println(lv);

  }
//  static void method2(){
//    System.out.println("method2");
//  }

    };


public class VariableTest {

  public static void main(String[] args) {

    Variable v = new Variable();
    System.out.println(v.iv); // instance변수는 클래스명으로 접근 할 수 있다.

    System.out.println(Variable.sv); // class변수는 클래스명으로 접근한다. 객체 생성하지 않아도 이미 생성되어 있다.
    System.out.println(v.sv); // 래퍼런스를 통해 접근도 할 수 있다.

    //아래 2개 이해해야 될듯
    Variable.sv = 10;
    System.out.println(v.sv);

    v.method();

    Variable v2 = new Variable();
    System.out.println(v2.sv);

    Variable.sv = 20;
    System.out.println(v.sv);
    System.out.println(v2.sv);

    v.sv++;
    System.out.println(v2.sv);


  }
}
