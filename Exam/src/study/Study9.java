package Exam.src.study;


public class Study9 {
//올바른 출력은?
  public static void main(String[] args) {
    A b = new B(); // b는 A타입을 반환하지만, B객체를 참조
    b.paint();
    b.draw();
  }
}
class A {

  public void paint() {
    System.out.println("A");
    draw();
  }

  public void draw() {
    System.out.println("B");
    draw();
  }
}

class B extends A {

  public void paint() {
    super.draw();
    System.out.println("C");
    this.draw();
  }

  public void draw() {
    System.out.println("D");
  }
}
