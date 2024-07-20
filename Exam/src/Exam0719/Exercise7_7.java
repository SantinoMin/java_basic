package Exam.src.Exam0719;

//09:26~
class Parent {

  int x = 100;

  Parent() {
    this(200);
  }

  Parent(int x) {
    this.x = x;
  }

  int getX() {
    return x;
  }
}

class Child extends Parent {

  int x = 3000;

  Child() {
    this(1000);
  }

  Child(int x) {
    this.x = x;
  }
}


public class Exercise7_7 {

  public static void main(String[] args) {
    Child c = new Child();
    System.out.println("x=" + c.getX());
  }
}

//a. 지역변수 - 값을 변경할 수 없다.
//b. 클래스 - 클래스에 새로운 멤버를 추가할 수 없다. c. 메서드 - 오버로딩을 할 수 없다.
//d. 멤버변수 - 값을 변경할 수 없다.
//b만 잘못됨.