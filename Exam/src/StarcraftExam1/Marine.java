package Exam.src.StarcraftExam1;

interface StimPack {

  void stimPack();
}

//스터디에서 질문하기.
//생성자는 인스턴스 객체가 생성될 때 초기화가 되는데,
//1)특정 값을 설정하지 않으면 0으로 출력이 되는지
//2)interface의 경우 빈 값을 반환하게 되는지?

//Stimpack같은 인스턴스 변수는 interface로 생성해서 가져오는건지?

public class Marine extends Unit {

  StimPack stimpack;

  Marine(int x, int y, Move move, Stop stop, StimPack stimpack) {
    super(x, y, move, stop);
    this.stimpack = stimpack;
  }
}


