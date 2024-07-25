package Exam.src.StarcraftExam1;

interface Load {

  void load();
}

interface Unload {

  void unload();
}

public class Dropship extends Unit {

  //타입이 정해져 있는 경우 int,String 매개변수를 가져올 수 있지만,
  //
  Load load;
  Unload unload;

  Dropship(int x, int y, Move move, Stop stop, Load load, Unload unload) {
    super(x, y, move, stop);
    this.load = load;
    this.unload = unload;
  }
}