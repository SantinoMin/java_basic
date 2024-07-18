//package Exam.src.InheriTest;
//
//class Point {
//
//  int x;
//  int y;
//
//  //부모의 기본 생성자를 넣어줘야 에러가 안 뜸
////  Point(){}
//
//  Point(int x, int y) {
//    this.x = x;
//    this.y = y;
//  }
//
//
//}
//
//class Point3D extends Exam.src.homework0717.Point {
//
//  //만약 부모 생성자를 수정할 수 없을 때, 아래와 같이 직접 작성해주기.
//  Point3D() {
//    super(0, 0);
//  }
//}
//
//class Account {
//
//  int id;
//  String name;
//  int balance;
//
//  Account(int id, String name, int balance) {
//    this.id = id;
//    this.name = name;
//    this.balance = balance;
//  }
//
//  //Account는 무조건 id를 가지고 있어야 됨으로, Account(){} 빈 생성자를 만들지 않았음.
//  Account(int id) {
//    this.id = id;
//  }
//
//  Account(int id, String name) {
//    this.id = id;
//    this.name = name;
//  }
//
//}
//
//;
//
//class SpecialAccount extends Account {
//
//  String grade;
//
//SpecialAccount(int id) {
//  super(id);
//}
//
//SpecialAccount(int id, String name) {
//  super(id,name);
//}
//
//SpecialAccount(int id, String name, int money, String grade) {
//  super(id, name, money);
//  this.grade = grade;
//}
//};
//
//
//public class InheritTest3 {
//
//  public static void main(String[] args) {
//
//  }
//}
