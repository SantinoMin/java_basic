package Exam.src.StarcraftExam1;

interface ChangeMode{
  void changeMode();
}

public class Tank extends Unit{

  ChangeMode changeMode;



  Tank(int x, int y, Move move, Stop stop, ChangeMode changeMode){
    super(x,y,move,stop);
    this.changeMode = changeMode;
  }


}
