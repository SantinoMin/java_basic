package Exam.src.examClass;

public class ClassArrayTest {

  public static void main(String[] args) {

    //!! 객체 3개가 아니라, 래퍼런스 3개임
    //객체를 생성해서 써야함. 일반 프리미티브 타입하고 다름

    //!!아래 코드 어떻게 실행되는지 모르겠는데?
    Person[] pers = new Person[3]; // Person 객체가 생성된 것이 아님, reference 변수 3개만 힙에 생성됨.
    int cnt = 0;
    pers[0] = new Person();
    pers[0].age = 20;
    pers[0].height = 178.2;
    pers[0].name = "월요일";
    cnt++;

    for(int i = 0; i < cnt; i++){
      System.out.println(pers[i].info());
    }


  }
}
