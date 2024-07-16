package Exam.src.chapter5;

public class TArrayTest2 {

  public static void main(String[] args) {
    int[][] score = {{80, 80, 80, 80}, {90, 90, 90, 90}, {100, 100, 100, 100}};
    int[][] total = new int[score.length + 1][score[0].length + 1];

    for (int i = 0; i < score.length; i++) {
      for (int j = 0; j < score[0].length; j++) {

      }
    }

    // 80 80 80 80 320
    // 90 90 90 90 360
    // 100 100 100 100 400
    // 270 270 270 270 1080
  }
}
