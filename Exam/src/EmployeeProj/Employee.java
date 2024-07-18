package Exam.src.EmployeeProj;

public class Employee {

  int num;
  String name;
  int departmentNum;
  Department department;
  int salary;

  public Employee() {
  }

  public Employee(int num, String name, Department department, int salary) {
    this.num = num;
    this.name = name;
    this.department = department;
    this.salary = salary;
  }

  public Employee(int num, String name, int departmentNum, int salary){
    this.num = num;
    this.name = name;
    this.departmentNum = departmentNum;
    this.department = new Department(departmentNum, department.departName);
    this.salary = salary;
    //또는
//    this(num, name, new Department(departmentNum, department.departName), salary);
  }

  public Employee(int num, String name, int departmentNum, int salary){
    this.num = num;
    this.name = name;
    int departmentNum = 0;


  }


  public String info() {
    return String.format("사번:%d, 이름: %s, 부서: %s, 급여:%d, num, name, department.name, salary");
  }
}
