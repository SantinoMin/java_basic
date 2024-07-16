package Exam.src.ForTest;

public class ForTest2 {

  public static void main(String[] args) {
    //1+2+3+4+5....했을 경우 합이 100이거나 넘는 합의 값과 그때의 마지막 더해지는 값 구하기.

    //1. 합이 100이거나 넘는 값
    //2. 그때의 마지막 더해지는 값
    int sum = 0, i;
    for(i=1; sum<100; i++) {
        sum += i;
    }
    System.out.println(i-1);
    System.out.println(sum);
  }
}
