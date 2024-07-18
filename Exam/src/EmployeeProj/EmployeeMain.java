//package Exam.src.EmployeeProj;
//
//import Exam.src.EmployeeProj.Company.Department;
//import Exam.src.EmployeeProj.Company.Employee;
//
////class Company{
////    int num;
////    String name;
////    Department department;
////    int salary;
////
//////  int num, String name, String department, int salary
////String addEmployee(Employee employee){
////
////  return "";
////};
//
////  class Employee{
////    int num;
////    String name;
////    Department department;
////    int salary;
////  };
//
////  Company(){
////      Employee emp = new Employee();
////      this.num = emp.num;
////      this.name=emp.name;
////
////      Department dep = new Department();
////      this.department=dep.department;
////      this.salary=dep.salary;
//
////  }
//
////static class Department{
////    int departNum;
////    String departName;
////    int salary;
////}
//
////};
//
//public class EmployeeMain {
//
//  //사번,이름,부서,급여
//  public static void main(String[] args) {
//
//    Company com = new Company();
//    com.addEmployee(new Employee(100, "홍길동", new Department(10, "홍보부"), 1000000));
//    com.addEmployee(new Employee(101, "김길동", new Department(11, "인사과"), 200000));
//    com.addEmployee(new Employee(102, "허길동", new Department(12, "개발부"), 300000));
////    com.addEmployee(new Employee(103, "허길동", 13, "총무부", 400000));
//    com.addEmployee(new Employee(104, "차길동", new Department(), 0));
//
//
//    com.allEmployeeInfo();
//    System.out.println("회사 급여 총액" + com.getTotalPay());
//
//    com.regDepartment(104,10,"홍보부");
//
//    com.regPay(104, 300000);
//
//  }
//}
//
////출력 결과
////사번: 100, 이름: 홍길동, 부서: 홍보부, 급여: 1000000
////사번: 101, 이름: 김길동, 부서: 인사과, 급여: 1000000
////사번: 102, 이름: 허길동, 부서: 개발부, 급여: 1000000
////사번: 104, 이름: 차길동, 부서: 미정, 급여: 0
////사번: 104, 이름: 차길동, 부서: 홍보부, 급여: 0
//
//// 회사 급여 총액: 600000
//
