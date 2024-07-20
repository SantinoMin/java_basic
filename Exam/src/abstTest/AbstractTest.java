package Exam.src.abstTest;

abstract class Player {
  int currentPos;
  Player() {}
  void play(){
    //오버로딩(play-play) // 하나는 구현부 있고, 하나는 구현부 없음
    play(currentPos);
  }
  abstract void play(int pos);
  abstract void stop();
}

class MyPlayer extends Player {

  @Override
  void play(int pos) {
    System.out.println("MyPlayer play(int pos) 호출");
  }

  @Override
  void stop() {
    System.out.println("MyPlayer stop() 호출");
  }
}


public class AbstractTest {

  public static void main(String[] args) {
//    Player p = new Player(); // 실행 안 됨, abstract라서

    MyPlayer mp = new MyPlayer();
    mp.play();

  }

}
