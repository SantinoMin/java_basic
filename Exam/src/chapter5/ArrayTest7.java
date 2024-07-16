package Exam.src.chapter5;

import java.util.Scanner;

public class ArrayTest7 {

  public static void main(String[] args) {

    //!! 이어서 해보기
    Scanner sc = new Scanner(System.in);
    int[] max = new int[100];
    max[0] = 100;
    max[1] = sc.nextInt();

    //n번째 값에서 n+1번째 값을 빼기
    for (int i = 0; i < max.length; i++) {
      if (max[i] - (max[0]-max[i]) > 0) {
        System.out.print(max[i] + " ");
      } else {
        System.out.println("음수가 출력 되었습니다");
        break;
      }
    }
  }
};
