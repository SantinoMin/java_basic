package Exam.src.study;

class AA {

  //출력 결과:
  int a; // a=10

  public AA(int a) {
    this.a = a;
  }

  public void display() {
    System.out.println("a=" + a);
  }
}

class BB extends AA {

  public BB(int a) {
    super(a); // a=10
    super.display();
  }
}

public class Study10 {

  public static void main(String[] args) {
    BB obj = new BB(10);
  }
}
