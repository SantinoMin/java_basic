package Exam.src;

import Exam.src.dept.Department;
import Exam.src.pac.Student;

public class StudentMain {

  static Student[] studs = new Student[100];
  static int cnt;


  //이 부분?
  static void addStudent(Student stud) {
    studs[cnt++] = stud;

  }


  //학생 번호를 찾는 메서드
  static Student findStudByNum(int studNum) {
    Student stud = null;
    for (int i = 0; i < cnt; i++) {
      if (studs[i].getNum() == studNum) {
        stud = studs[i];
        break;
      }
    }
    return stud;
  }

  ;

  static void transfer(int studNum, int deptNum, String deptName) {
    Student stud = findStudByNum(studNum);
    if (stud == null) {
      System.out.println("학번오류");
      return;
    }
    if (stud.getDepartment() == null) {
      stud.setDepartment(new Department(deptNum, deptName));
    } else {
      //아래 부분 이해하기
      stud.getDepartment().setNum(deptNum);
      stud.getDepartment().setName(deptName);
    }
  }

  static void studentInfoByStudNum(int studNum) {
    Student stud = findStudByNum(studNum);
    if (stud == null) {
      System.out.println("학번오류");
      return;
    }
    System.out.println(stud.toString());
  }

  //deptNum은 어디서 가져온거? 아래의 호출 부분 보기(2)
  static void studentsInfoByDeptNum(int deptNum) {
    for (int i = 0; i < cnt; i++) {
      if (studs[i].getDepartment().getNum() == deptNum) {
        System.out.println(studs[i].toString());
      }
    }

  }

  public static void main(String[] args) {

    Department department = new Department();
    department.setName("기계공학");

    //해당 학생을 찾은 후
    //해당 학번에 해당하는 학생을 수정해야 되는듯?
//    for(int i = 0; i < studs.length; i++){
//      studs[i] = new Student();
//      studs[i].setDepartment(department);
//    }

    //이렇게 안하고 다른 방법으로 함 --> 위에
    Student addStudent = new Student();
    addStudent.setNum(102);
    addStudent.setName("하길동");
    addStudent.setDepartment(department);

    addStudent(new Student(100, "홍길동", 1, 10, "기계공학", "호서대"));
    addStudent(new Student(101, "김길동", 2, 11, "전자공학", "호서대"));
    addStudent(new Student(102, "하길동", 3, 12, "철학", "호서대"));
    addStudent(new Student(103, "하길동", 3, 13, "산업공학", "호서대"));

    transfer(100, 13, "산업디자인"); //전과 : 학번이 100인 학생이 산업디자인과로 전과
    studentInfoByStudNum(102);

    //(2)
    studentsInfoByDeptNum(13); //13번 2명을 출력

  }
}

//1.학생-부서에 맞는 메서드를 해당 클래스 내부에 생성
//2.getter,setter를 통해서 해당 값들을 설정

//출력
//학번:102, 이름: 하길동, 학년:3, 학과: 철학, 대학: 호서대
//...