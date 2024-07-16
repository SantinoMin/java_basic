package Exam.src.chapter5;

import java.util.Scanner;

public class TArrayTest2_4 {

  public static void main(String[] args) {
//   10개의 정수를 입력받아 배열에 저장한 후
//   짝수 번째 입력된 값의 합과 홀수 번째 입력된 값의 평균을 출력하는 프로그램을 작성하시오.
//   평균은 반올림하여 소수첫째자리까지 출력한다.

    //!ArrayTest6

    Scanner sc = new Scanner(System.in);
    Long[] cnt = new Long[10];

    //1)짝수 번째 입력된 값의 합
    while (true) {
      Long input1 = sc.nextLong();
      if ((input1 % 2 == 0)) {

        //++추가하는 코드 필요
      }
      else{
          Long input2 = sc.nextLong();
          if(!(input2 % 2 == 0)){
            break;
        //++추가하는 코드 필요

        }

      }

    }}      //2)홀수 번째 입력된 값의 합

      //3) 1)2)의 평균 구하기

    };
