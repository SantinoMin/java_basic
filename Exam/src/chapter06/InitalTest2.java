//package Exam.src.chapter06;
//
//class MyClass {
//
//  static int[] arr = new int[10];
//
//  //이렇게 사용함
//  //스태틱 블럭에서의 초기화 또는 명시적 초기화
//  static { //스태틱 블럭에서의 초기화
//    for (int i = 0; i < arr.length; i++) {
//      int rand = (int) (Math.random() * 100) + 1; //!! 100은 왜 곱하는거지?
//      arr[i] = rand;
//    }
//
//    //랜덤으로 값을 구하려면?
////  MyClass() { //생성자
////    for (int i = 0; i < arr.length; i++) {
////        int rand = (int)(Math.random()*100)+1; //!! 100은 왜 곱하는거지?
////        arr[i] = rand;
////    }
////  }
//  }
//
//  public class InitalTest2 {
//   //스크린샷 있는 부분 확인해보기
//    public static void main(String[] args) {
//      for(int i=0; i<MyClass.arr.length; i++){
//        System.out.println(MyClass.arr[i]+" ");
//      }
//      MyClass myClass1 = new MyClass();
//      MyClass myClass2 = new MyClass();
//    }
//  }
//};
