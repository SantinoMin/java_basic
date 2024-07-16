package Exam.src.chapter5;

import java.util.Scanner;

public class TArrayTest2_2 {

  public static void main(String[] args) {
//    영문 대문자를 입력받다가 대문자 이외의 문자가 입력되면 입력을 중단하고
//    영문 대문자들에 대하여 1번 이상 입력된 각 문자와 그 문자의 개수를 사전 순으로 출력하는 프로그램을 작성하시오.
//        입력되는 문자의 개수는 2개 이상 100개 이하이다.

    //ArrayTest4

    Scanner sc = new Scanner(System.in);
    int[] cnt = new int[26];
    while(true) {
      char input = sc.next().charAt(0);
      if (!(input >= 'A' && input <= 'Z'))
        break;
      cnt[input - 'A']++;
    }
///!! cnt[input-'A']++ 이건 어떤 값이 나오는거지?
    for(int i = 0; i < cnt.length; i++) {
      if(cnt[i]==0) continue;
      System.out.println();
    }

    }
  }
;
