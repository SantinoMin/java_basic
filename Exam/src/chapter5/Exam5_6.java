package Exam.src.chapter5;

public class Exam5_6 {

  public static void main(String[] args) {

    int[] coinUnit = { 500,100,50,10};
    int money = 2680;
    System.out.println("money" + money);
    for (int i = 0; i < coinUnit.length; i++) {
      //coinUnit.length는 4맞는지?
      int cnt = money/coinUnit[i]; // 동전의 개수
      //String.format이 뭔지?
      System.out.println(String.format("%d원: %d", coinUnit[i], cnt));
      money %= coinUnit[i];


      //500원으로 나눈 몫 + 나머지 필요
//      2650/500 =5, 나머지 2650%500=180
//      180/100=1, 180%100=80
//      80/50=1, 80%50=30
//      30/10=3, 30%10=0

    }
  }
}
