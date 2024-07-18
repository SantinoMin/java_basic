//
//package Exam.src.chapter06;
//
//class Car1 {
//
//  String color;
//  String gearType;
//  int door;
//
//  Car() {
//    this("white", "auto", 4); // 바로 아래의 Car(파라미터3개짜리)를 참고해서 가져올 수 있음 (this를 통해서)
//  }
//
//  Car(String color, String gearType, int door) {
//    this.color = color;
//    this.gearType = gearType;
//    this.door = door;
//  }
////    color = c;
////    gearType = g;
////    door = d;
//
//  Car(Car c) {
//    this.color = c.color;
//    this.gearType = c.gearType;
//    this.door = c.door;
//
//  }
//
//
//public static void main(String[] args) {
//  Car car1 = new Car();
//  Car car2 = new Car(car1);
//}}
//
//
