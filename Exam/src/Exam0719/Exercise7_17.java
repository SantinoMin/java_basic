//package Exam.src.Exam0719;
//
////[7-17] 아래 세 개의 클래스로부터 공통부분을 뽑아서 Unit이라는 클래스를 만들고, 이 클래스를 상속받도록 코드를 변경하시오.
//
//public class Unit {
//
//  //!!현재 위치를 int로 못 설정하고, 메서드로 만들어야 되는거 맞는지?
//  int x, y; // 현재 위치
//  void location(int x, int y) {}
//
//  void move(int x, int y) {
//  } // 지정된 위치로 이동
//
//  void stop() {
//    System.out.println("현재 위치에 정지");
//  }
//
////  void Unit(){
////  }
//
//
//  public class Marine extends Unit { // 보병 intx,y; //현재 위치 void move(int x, int y) voidstop()
//
//    @Override
//    void move(int x, int y) {
//    }
//
//    @Override
//    int x
//
//    void stimPack() {
//      System.out.println("스팀팩 사용");
//    }
//
//    ;
//  }
//
//  class Tank extends Unit { // 탱크 intx,y; //현재 위치 void move(int x, int y) voidstop()
//
//    void changeMode() {
//      System.out.println("공격 모드로 변환한다");
//    }
//
//    @Override
//    void move(int x, int y) {
//      System.out.println(String.format("(%d, %d)로 이동", x, y));
//    }
//  }
//
//  class Dropship extends Unit { // 수송선 intx,y; //현재 위치 void move(int x, int y) void stop()
//
//    { /* 지정된 위치로 이동 */ }
//
//    {/* 현재 위치에 정지 */}
//
//    { /* 스팀팩을 사용한다.*/}
//
//    { /* 지정된 위치로 이동 */ }
//
//    {/* 현재 위치에 정지 */}
//
//    { /* 공격모드를 변환한다. */}
//
//    { /* 지정된 위치로 이동 */ }
//
//    {/* 현재 위치에 정지 */}
//
//    { /* 선택된 대상을 태운다.*/ }
//
//    { /* 선택된 대상을 내린다.*/ }
//  }
//
////부모 클래스 상속 받도록 만들기
////자식이 달리 구현해야 되는 것 생각하기 // 오버라이딩
//
//
//  public class Exercise7_17 {
//
//    //tank의 changeMode부분만 가져오는 거 다시 이해하기.
//    public static void changeMode(Unit[] unit) {
//      for (int i = 0; i < unit.length; i++) {
//        //!! instanceof 란?
//        if (unit[i] instanceof Tank == true) {
//          //down-casting 해줘야함 (Tank)
//          ((Tank) unit[i]).changeMode();
//        }
//      }
//    }
//
//    public static void stimPack(Unit[] unit) {
//      for (int i = 0; i < unit.length; i++) {
//        //!! instanceof 란?
//        if (unit[i] instanceof Marine == true) {
//          //down-casting 해줘야함 (Tank)
//          ((Marine) unit[i]).stimPack();
//        }
//      }
//    }
//
//
//    public static void main(String[] args) {
//      Unit[] units = new Unit[3];
//
//      units[0] = new Marine();
//      units[1] = new Tank();
//      units[2] = new Dropship();
//      units[3] = new Marine();
//
//      for (int i = 0; i < 3; i++) {
//        units[i].move(10, 10);
//      }
//
//      changeMode(unit);
//      stimPack(unit);
//    }
//  }
//};
