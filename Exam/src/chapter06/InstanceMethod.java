package Exam.src.chapter06;


class MyMath2 {

  long a, b; // !! class MyMath2의 변수임

  long add() {
    return a + b;
  }

  static long add(long a, long b) {
    return a + b;
  }
}

public class InstanceMethod {

  public static void main(String[] args) {
    System.out.println(MyMath2.add(200L, 100L));
    MyMath2 mm = new MyMath2();
    mm.a = 200L;
    mm.b = 100L;
    System.out.println(mm.add());
  }
}

//1) 지역변수: 해당 메서드 내부에서만 사용 가능한 변수
//2) 인스턴스 변수: 인스턴스 객체를 생성할 때, 설정하게 되는 변수
//3) 클래스 변수 : static으로 사용되는 변수