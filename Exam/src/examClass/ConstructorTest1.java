package Exam.src.examClass;

class MyClass {
  int n;
  //기본 생성자 : 파라미터가 없는 생성자
  public MyClass(){
    //생성자: 클래스명과 동일한 함수 && 리턴 타입이 없음 && 대부분 public && new에 의해 자동 호출
    //생성자도 overloading가능 //
    System.out.println("MyClass");
  }

  //생성자 오버로딩
  public MyClass(int num){
    n = num;
  }
}


//!! 출력되는 값 확인하기
public class ConstructorTest1 {

  public static void main(String[] args) {

    MyClass mc = new MyClass(); // 인스턴스 객체에 의해서 위의 "MyClass"가 실행이 됨.
    System.out.println(mc.n);

    MyClass mc2 = new MyClass(10);
    System.out.println(mc2.n);

  }
}
