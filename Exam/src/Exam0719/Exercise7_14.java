package Exam.src.Exam0719;

class SutdaCard {

  int num;
  final boolean isKwang;

  SutdaCard() {
    this(1, true);

    //이거 없애면 위 isKwang final 부분의 초기화를 못해서 에러남.
//    this(1, true);
  }

  SutdaCard(int num, boolean isKwang) {
    this.num = num;
    this.isKwang = isKwang;
  }

  public String toString() {
    return num + (isKwang ? "K" : "");
  }
}

public class Exercise7_14 {

  SutdaCard card = new SutdaCard(1, true);
}

