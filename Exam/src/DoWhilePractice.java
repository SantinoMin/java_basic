package Exam.src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DoWhilePractice {

  public static void main(String[] args) {

//    다음은 1~100사이의 숫자를 맞추는 게임을 실행하던 도중에 숫자가 아닌 영문자를 넣어서 발생한 예외이다.
//    예외처리를 해서 숫자가 아닌 값을 입력했을 때는 다시 입력을 받도록 보완하라.

//    1과 100사이의 값을 입력하세요 :50
//    더 작은 수를 입력하세요.
//    1과 100사이의 값을 입력하세요 :asdf
//    유효하지 않은 값입니다. 다시 값을 입력해주세요. 1과 100사이의 값을 입력하세요 :25
//    더 큰 수를 입력하세요.

    Scanner sc = new Scanner(System.in);
    int cnt = 0;
    int input = 0;
    int answer = (int) (Math.random() * 100) + 1;

    do {
      cnt++;
      System.out.println("1과 100사이의 값을 입력하세요 : ");
      try {
        input = new Scanner(System.in).nextInt();
      } catch(InputMismatchException e){
        System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
        continue;
      }

      if(input > answer){
        System.out.println("더 작은 수를 입력하세요.");
      } else if(input < answer){
        System.out.println("더 큰 수를 입력하세요");
      } else {
        System.out.println("맞습니다.");
        System.out.println("시도 횟수는 " + cnt + "번 입니다.");
        break;
      }
    } while (true);

  }
}


