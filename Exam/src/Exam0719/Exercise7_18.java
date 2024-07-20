//package Exam.src.Exam0719;
//
//class Robot {
//
//}
//class DanceRobot extends Robot { void dance() {
//  System.out.println("춤을 춥니다."); }
//}
//class SingRobot extends Robot { void sing() {
//  System.out.println("노래를 합니다."); }
//}
//class DrawRobot extends Robot { void draw() {
//  System.out.println("그림을 그립니다."); }
//}
//
//
//public class Exercise7_18 {
//
//  //main이 static이라서 action메서드도 static
//  static void action(Robot robot){
//    //instanceof 해석하는 법? DanceRobot이 robot에 포함된다면?
//    if(robot instanceof DanceRobot){
//      ((DanceRobot)robot).dance();
//    }else  if(robot instanceof SingRobot){
//
//    }else  if(robot instanceof DrawRobot){
//
//    }else  if(robot instanceof Robot){
//    }
//  }
//
//  public static void main(String[] args) {
//    Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
//    for(int i=0; i< arr.length;i++) action(arr[i]);
//  } // main }
//
//}
