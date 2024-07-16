package Exam.src.chapter5;

import java.util.Scanner;

public class TArrayTest11 {

  public static void main(String[] args) {

    //주사위 놀이, 각 숫자가 몇번씩 나왔는지
    //주사위 10번 던짐
    //한 번 던질 때마다 나온 숫자를 입력 받아서 각 숫자가 몇번씩 나왔는지 출력하는 프로그램 작성하기.

    Scanner sc = new Scanner(System.in);
    int[] cnt = new int[7];

    for(int i=0;i<10;i++) {
      int input = sc.nextInt();
      cnt[input]++;

    }




  }
}
