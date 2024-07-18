package Exam.src.pac;

import Exam.src.dept.Department;

public class Student {

  int num;
  String name;
  int grade;
  String school;
  Department department;

  //이렇게도 사용함
  public Student(int num, String name, int grade, int deptNum, String deptName, String school) {
    this.num = num;
    this.name = name;
    this.grade = grade;
    //아래의 (1)대신 사용 가능함.
//        Department dept = new Department();
//        dept.setNum(deptNum);
//        dept.setName(deptName);
//        this.department = dept;

    //Department(1)
    this.department = new Department(deptNum, deptName);

  }

  public int getNum() {
    return num;
  }

  public void setNum(int num) {
    this.num = num;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getGrade() {
    return grade;
  }

  public void setGrade(int grade) {
    this.grade = grade;
  }

  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  public Department getDepartment() {
    return department;
  }

  public void setDepartment(Department department) {
    this.department = department;
  }

  public String toString() {
    return String.format("학번:%d, 이름:%s, 학년:%D, 학과: %s, 대학: %s", num, name, grade, department.getName(),school);
  }
}
