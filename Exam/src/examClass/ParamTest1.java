//package Exam.src.examClass;
//
////class Data {
////  int num;
////};
//
//
////!! 이해 안가는데?
//public class ParamTest1 {
//
//  public static void increment(int d){ // d는 스택에 쌓임, 지역 변수
//    d += 1000; // d = d+1000;
//    System.out.println(++d);
//  };
//
//  public static void increment (Data d){
//    d.num = 1000;
//    System.out.println(d.num);
//  };
//
//  public static void main(String[] args) {
//    Data data = new Data();
//    data.num = 10;
//    increment(data.num);
//    System.out.println(data.num); // !! 1000이 아니라 10으로 출력됨.
//    //실행되고 없어짐
//
//    System.out.println("======");
//    increment(data);
//    System.out.println(data.num);
//    //원본까지 바뀜 // 콜 바이 레퍼런스
//    //클래스는 무조건 레퍼런스
//
//    //참조형 래퍼런스 == read, write
//  }
//}
