//package Exam.src.Exam0719;
//
//
//public class Exercise7_10 {
//
//  public static void main(String args[]) {
//
//    MyTv2 t = new MyTv2();
//    t.setChannel(10);
//    System.out.println("CH:" + t.getChannel());
//    t.setVolume(20);
//    System.out.println("VOL:" + t.getVolume());
//
//    MyTv2 t = new MyTv2();
//    t.setChannel(10);
//    System.out.println("CH:"+t.getChannel());
//    t.setChannel(20);
//    System.out.println("CH:"+t.getChannel());
//    t.gotoPrevChannel();
//    System.out.println("CH:"+t.getChannel());
//    t.gotoPrevChannel();
//    System.out.println("CH:"+t.getChannel());
//
//  }
//};
//
////기존 체널 번호에서 다음 체널 번호로 이동
////이전의 체널 번호를 저장해둬야 함
////(0,10,20 ..) 이렇게 되어있더라도 0 -> 10 -> 20 -> 10)
////10으로 다시 돌아올 수도 있어서.
