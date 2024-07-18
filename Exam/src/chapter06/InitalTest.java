//package Exam.src.chapter06;
//
//
//// 기본 초기화 --> 명시적 초기화 --> 인스턴스 통한 초기화 -->
////생성자를 통한 초기화를 제일 많이 사용함.
//
////스태틱 변수는 초기화를 생성자에서 하지 않음
//
//class Engine {
//
//}
//
//class Car {
//// 명시적 초기화 -- 프로그램 시작할 때, 초기화 됨.
////  int door = 4;
////  Engine engine = new Engine();
//
//  int door;
//  Engine engine;
//
////  Car(int door, Engine engine) { // 생성자를 통한 초기화
////    this.door = door;
////    this.engine = engine;
////  }
//  {   // 인스턴스 초기화 블럭
//    door = 4;
//    engine = new Engine();
//  }
//
////  sout(door); << 에러남 // 이유: 해당 구문은 명령어라서 , 반드시 블럭 안에 들어가야 함.
//
//
//}
//
//public class InitalTest {
//
//  public static void main(String[] args) {
////    Car car = new Car(4, new Engine()); // !!명시적 초기화 하는법 이해하기
////    car.door = 4;
////    car.engine = new Engine();
//
//    Car car = new Car();
//
//  }
//}
