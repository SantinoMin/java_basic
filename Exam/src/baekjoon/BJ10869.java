package Exam.src.baekjoon;

import java.util.Scanner;

public class BJ10869 {

  public static void main(String[] args) {

//  문제
//  두 자연수 A와 B가 주어진다. 이때, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
//
//  입력
//  두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)

    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();

    int plus = A + B;
    int minus = A - B;
    int div = A / B;
    int mal = A * B;

    System.out.println(plus);
    System.out.println(minus);
    System.out.println(div);
    System.out.println(mal);

//  A >= 1 && B <= 10000

  }
}