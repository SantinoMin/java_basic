package Exam.src.examClass;

class Person {

  //클래스는 속성과 기능
  int age;
  double height;
  String name;

  //info = 메서드 // 기능
  //!! info가 함수인가?
  String info() {
    return String.format("나이:%d, 키:%.1f", age, height)
        ;
  }

}


public class ClassTest1 {

  public static void main(String[] args) {

    Person p1 = new Person();
    p1.age = 30;
    p1.height = 175.3;
    p1.name = "홍길동";

    Person p2 = new Person();
    p2.age = 35;
    p2.height = 165.3;
    p2.name = "홍길순";

    Person p3 = p2;
//    System.out.println(p3.info());

    p3.age = 40;
    System.out.println(p3.info());
    p3.age = p2.age;
    p3.height = p2.height;
    p3.name = p2.name;
    p3.age = 40;

    //!!값이 그대로 복제가 되는건지??

    System.out.println(String.format("나이%:d, 키: %f", p1.age, p1.height));
    System.out.println(p1.info());


    //p2,p3 부분 이해하기 // p3 = p2; 하는 순간 p2값이 완전히 바뀜.
    //원본을 복사하는게 아니라,

    int n = 10;
    double d = 12.3;

    //클래스와 객체 용어의 차이??
    //클래스는 타입이고

    //Tv클래스로 선언 해주고 나면, 타입 설정없이 사용 할 수 있음
    //Tv t;
    // t=new Tv();
    //Tv t = new Tv();
    //이거 두개 같은건가?




  }
};
