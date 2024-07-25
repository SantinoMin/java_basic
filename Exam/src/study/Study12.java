package Exam.src.study;

//값 다시 구해보기.
class Parent1 {

  int x = 1000;

  Parent1() {
    this(3000);
  }

  Parent1(int x) {
    this.x = x;
  }
}

class Child1 extends Parent1 {

  int x = 4000;

  Child1() {
    this(5000);
  }

  Child1(int x) {
    this.x=x;
  }

  int getX() {
    return x;
  }
}

public class Study12 {

  public static void main(String[] args) {

    Child1 obj = new Child1();
    System.out.println(obj.getX());
  }
}
