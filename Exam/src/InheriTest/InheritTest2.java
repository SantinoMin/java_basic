package Exam.src.InheriTest;

class Base {
  int n;
  void method1(){
    System.out.println("Base method1");
  }
}

class Derived extends Base {
  int m;
  void method2(){
    System.out.println("Derived method2");
  }

  void method1(){ // 부모의 method1 재정의(overriding) : 리턴 타입, 메서드 이름, 파라미터의 개수와 타입 모두 동일 해야함.
    System.out.println("Derived method1");
  }

}

public class InheritTest2 {

  public static void main(String[] args) {
Base base = new Base();
base.n = 10;
base.method1(); // Base method1 출력 예상

    Derived derived = new Derived();
    derived.n = 100;
    derived.m = 200;
    derived.method1();
    derived.method2();

  }
}
