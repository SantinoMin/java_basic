package Exam.src.StarcraftExam1;

interface Load {

  void load();
}

interface Unload {

  void unload();
}

public class Dropship extends Unit {

  Load load;
  Unload unload;

  Dropship(int x, int y, Move move, Stop stop, Load load, Unload unload) {
    super(x, y, move, stop);
    this.load = load;
    this.unload = unload;
  }
}
