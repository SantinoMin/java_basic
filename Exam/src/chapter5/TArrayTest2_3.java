package Exam.src.chapter5;

import java.util.Scanner;

public class TArrayTest2_3 {

  public static void main(String[] args) {

    //정수를 입력받다가 0이 입력되면 마지막에 입력된 0을 제외하고
    // 그 때까지 입력된 정수의 일의 자리 숫자가 각각 몇 개인지
    // 작은 수부터 출력하는 프로그램을 작성하시오. (0개인 숫자는 출력하지 않는다.)

    Scanner sc = new Scanner(System.in);
    int[] cnt = new int[10];
    while(true){
      int input = sc.nextInt();
      if(input == 0) break;
      cnt[input%10]++;
    }
//
//    for(int i = 0; i < cnt.length; i++) {
//
//    }

    //1) 정수를 입력 받다가 0이 입력되는 순간 찾기
    //2) 마지막에 입력된 0을 제외하기
    //3) 그 전까지 입력된 정수의 일의 자리 숫자 각각 몇개인지
    //4)작은 수부터 출력하기

  }
}
