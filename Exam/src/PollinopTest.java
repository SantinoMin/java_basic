//package Exam.src;
//
//class Base {
//  int baseNum;
//  void baseMethod(){
//
//  }
//}
//
////다형성 : 상속 -> 오버라이딩 -> 업 캐스팅 -> 자식 메서드 호출
//class Derived extends Base {
//  int derivedNum;
//  void derivedMethod(){
//
//    @Override
//        void method(){
//      System.out.println("Derived method");
//    }
//  }
//  Derived(){}
//
//};
//
//public class PollinopTest {
//
//  public static void main(String[] args) {
//    //생성자 호출, 베이스타입의 리퍼런스(주소) 리턴
//    Base base = new Base();
//    base.baseNum = 10;
//    base.baseMethod();
//
//
//    Derived derived = new Derived();
//    derived.baseNum = 20;
//    derived.derivedNum = 100;
//    derived.baseMethod();
//    derived.derivedMethod();
//
//
//    //이 부분 이해 잘 안 감.
//    Base base2 = new Derived();
//    base2.baseNum = 30;
//    base2.baseMethod();
//
//    base2.method(); // 다형성
////    base2.derivedNum = 200; // Error
////    base2.derivedMethod(); // Error
//
//    //(바꾸고자 하는 타입)
//    Derived derived2 = (Derived)base2; // Down-casting
//    derived2.derivedMethod();
//    derived2.derivedNum = 20;
//
//    Derived derived3 = (Derived)base; // x
//
//
//    //상속 관계에 한해서는, 자식 정보를 부모에 담음
////    Base base2 = new Derived(); // Up-casting : 자식 객체를 부모 레퍼런스 변수에 담는다.
//
//
//  }
//
//}