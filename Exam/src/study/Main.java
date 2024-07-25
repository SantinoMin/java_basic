package Exam.src.study;

//study12
//4000이라 입력했으나, 실제로 인스턴스 객체가 생성되면서 x=5000으로 변경됨.
class Parent {

  int x = 1000;

  Parent() {
    this(3000);
  }

  Parent(int x) {
    this.x = x;
  }
}

class Child extends Parent{

  int x = 4000;

  Child(){
    this(5000);
  }

  Child(int x){
    this.x = x;
  }

  int getX () {
    return x;
  }
}
public class Main{
public static void main(String[] args) {
      Child obj = new Child();
  System.out.println(obj.getX());
}}
