package Exam.src.Array;

public class LottoExam {

  public static void main(String[] args) {

    //한번 섞고, 가장 앞쪽의 6개를 가져오기
    //순번이 랜덤이여야 된다.

    int[] ball = new int[45];
    for (int i = 0; i < ball.length; i++) {

      ball[i] = i + 1;
    }

    //!!이거 이해하기
    for (int i = 0; i < 200; i++) {
      int idx1 = (int) Math.random() * 45;
      int idx2 = (int) Math.random() * 45;
      int t = ball[idx1];
      ball[idx1] = ball[idx2];
      ball[idx2] = t;
    }

    for(int i=0; i<6; i++){
      System.out.println(ball[i]+" ");

    }
  }
}
