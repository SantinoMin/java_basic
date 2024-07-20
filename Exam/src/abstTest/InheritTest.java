package Exam.src.abstTest;

//아래 2개 같음 // B는 extends Object; 부분이 생략된 것.
class A extends Object{};
class B {};

//class는 상속이 1개만 가능함 // 자바는 다중 상속 허용하지 않음.
//class C extends A,B {}
class C extends A {};
class D extends B {};


interface I1 {}
interface I2 {}

class E implements I1, I2 {}  // 하지만, 인터페이스는 다중상속을 허용한다.
class F extends D implements I1, I2 {} // 단일 클래스 상속, 다중 인터페이스 상속

public class InheritTest {

  public static void main(String[] args) {
    A a1 =  new A();
    Object o1 = new A();

    B b1 = new B();
    Object o2 = new B();

    C c1 = new C();
    Object o3 = new C();
    A o4 = new C();

    D d1 = new D();
    B b2 = new B();
    Object o5 = new D();

    E e1 = new E();
    Object o6 = new E();
    I1 i1 = new E();
    I1 i2 = new E();

    F f1 = new F();
    I1 i3 = new F();
    I2 i4 = new F();
    Object o7 = new F();
    D d2 = new F();


  }
}
