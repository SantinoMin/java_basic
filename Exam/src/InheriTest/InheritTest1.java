package Exam.src.InheriTest;

class Person {

  int age;
  String name;

  //아래 부분 주석처리하면 에러 뜸
  Person() {
  }

  ;
  Person(int age, String name) {
    this.age = age;
    this.name = name;
  }
  String info(){
    return String.format("이름:%s, 나이:%d", name, age);
  }

}

class Student extends Person {

  int grade;
  String school;
  Student(){};

  Student(int age, String name, int grade, String school) {
//    this.age=age;
//    this.name=name;
    super(age,name); // 부모 생성자

    this.grade=grade;
    this.school=school;
  }

  @Override
  String info() {
//    return String.format("이름:%s, 나이:%d, 학년:%d, 학교:%d", name, age, grade,school);
    //부모꺼 쓰고 + 뒤에 조금 더 추가.
    return super.info()+String.format(",학년:%d, 학교:%d", grade, school);
  }

  void test(){
    System.out.println("시험보다");
  }
}

public class InheritTest1 {

  public static void main(String[] args) {

    Student stud = new Student();
    stud.age = 10;
    stud.name = "박초딩";
    stud.grade = 3;
    stud.school = "호서초등학교";

    Student stud2 = new Student(12, "김초딩", 5, "가산초등학교");
    System.out.println(stud.info());
    System.out.println(stud2.info());
    stud.test();

    Person p = new Person();
    p.age=10;
    p.name="haha";
//    p.grade=3; // 접근 안 됨. 자식만 접근 가능함
//    p.test(); // 접근 안 됨.  자식만 접근 가능함


    //괄호가 있는 super, 괄호가 없는 super(부모 객체의 주소)
  }
}
