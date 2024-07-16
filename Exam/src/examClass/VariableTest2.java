package Exam.src.examClass;

class Card {

  String number;
  String shape;
  static int height = 25;
  static int width = 15;

  String draw() {
    return String.format("숫자:%s, 모양:%s, 가로:%d, 세로:%d, number,shape, width, height");
  }

  ;
}

public class VariableTest2 {

  public static void main(String[] args) {
//    Card.width = 15;
//    Card.height = 25;

    Card h1 = new Card();
    h1.number = "A";
    h1.shape = "hart";

    Card h2 = new Card();
    h2.number = "2";
    h2.shape = "hart";

    Card d1 = new Card();
    d1.number = "A";
    d1.shape = "diamond";

    System.out.println(h1.draw());
    System.out.println(h2.draw());
    System.out.println(d1.draw());
  }
};
