package Exam.src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcerciseSelff8_8 {

  public static void main(String[] args) {
    // 1~100사이의 임의의 값을 얻어서 answer에 저장한다.
    Scanner sc = new Scanner(System.in);
    int answer = (int) (Math.random() * 100) + 1;
    int input = 0; // 사용자입력을 저장할 공간
    int count = 0; // 시도횟수를 세기 위한 변수
    do {
      count++;
      System.out.print("1과 100사이의 값을 입력하세요 :");
      try {
        input = sc.nextInt();
        if (answer > input) {
          System.out.println("더 큰 수를 입력하세요.");
        } else if (answer < input) {
          System.out.println("더 작은 수를 입력하세요.");
        } else {
          System.out.println("맞췄습니다.");
          System.out.println("시도횟수는 " + count + "번입니다.");
          break;
        }
      } catch (InputMismatchException e) {
        System.out.println("유효하지 않은 값입니다. 다시 값을 입력해주세요.");
//        count--;
        //sc.nextInt();
        sc.next();

      }
    } while (true); // 무한반복문

  }

};
