package Exam.src.StarcraftExam1;

interface StimPack{
  void stimPack();
}

public class Marine extends Unit {

  StimPack stimpack;

  Marine(int x, int y, Move move, Stop stop, StimPack stimpack ) {
    super(x,y,move,stop);
    this.stimpack = stimpack;
  }

}



