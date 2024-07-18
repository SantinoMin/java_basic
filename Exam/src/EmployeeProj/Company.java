//package Exam.src.EmployeeProj;
//
//public class Company {
//
//  Employee[] emps = new Employee[100];
//  int cnt;
//
//  public void addEmployee(Employee emp) {
//    emps[cnt++] = emp;
//  }
//
//  public void allEmployeeInfo() {
//    for (int i = 0; i < cnt; i++) {
//      System.out.println(emps[i].info());
//    }
//  }
//
//  public int getTotalPay() {
//    int tot = 0;
//    for (int i = 0; i < cnt; i++) {
//      tot += emps[i].salary;
//    }
//    return tot;
//  }
//
//  public Employee findEmpByNum(int empNum) {
//    Employee emp = null;
//    for(int i=0; i<cnt; i++) {
//      if(emps[i].num==empNum){
//        emp = emps[i];
//        break;
//      }
//    }
//    return emp;
//  }
//
//  //void인 이유?
//  public void regDepartment(int empNum, int deptNum, String deptName) {
//
//    Employee emp = null;
//    for (int i = 0; i < cnt; i++) {
//      if (emps[i].num == empNum) {
//        emp = emps[i];
//        break;
//      }
//    }
//    if (emp == null) {
//      System.out.println("없는 사번 입니다.");
//      return;
//    }
//    emp.department.num = deptNum;
//    emp.department.name = deptName;
//
//    //아래 코드 틀렸음
////        emps[i] = new Employee();
////        emps[i].num = 104;
////        emps[i].departmentNum = 10;
////        emps[i].department() = "홍보부";
//  }
//
//  public void regPay(int empNum, int salary) {
//      Employee emp = findEmpByNum(empNum);
//      if(emp==null){
//        System.out.println("없는 사번 입니다.");
//        return ;
//      }
//      emp.salary = saraly;
//  }
//
//}
//;