package Exam.src.StarcraftExam1;

interface Move {

  void move(int x, int y);
}

interface Stop {

  void stop();
}

public class Unit {

  int x, y; //현재 위치
  Move move;
  Stop stop;

  public Unit(int x, int y, Move move, Stop stop) {
    this.x = x;
    this.y = y;
    this.move = move;
    this.stop = stop;
  }

}