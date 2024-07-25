package Exam.src.study;

public class Study11 {
//맞춤
  public static void main(String[] args) {
    Study11 study11 = new Study11();
    Study112 study112 = new Study112();
    System.out.println(study11.sun(3, 2) + study112.sun(3, 2));
//예상 출력: 5 + (1) + 5 = 11
  }

  int sun(int x, int y) {
    return x + y;
  }
}

class Study112 extends Study11 {


  int sun(int x, int y) {
    return x - y + super.sun(x, y);
  }
}
