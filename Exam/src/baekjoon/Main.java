package Exam.src.baekjoon;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

//  두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
//  문제(1000)
//  입력
//  첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//    Scanner sc = new Scanner(System.in);
//    int A = sc.nextInt();
//    int B = sc.nextInt();
//    int sum = A + B;
//    System.out.println(sum);

//    문제(1001)
//    두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오.
//    입력
//    첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//    Scanner sc = new Scanner(System.in);
//    double A = sc.nextInt();
//    double B = sc.nextInt();
//
//    if (A > 0 && B > 0 && B < 10) {
//      double result = A/B;
//      System.out.println(result);
//    }
//    else{
//      System.out.println("조건에 만족하지 않습니다");
//    }
//    sc.close();

//    문제(1001)
//    두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오.
//
//        입력
//    첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//    Scanner sc = new Scanner(System.in);
//    int A =  sc.nextInt();
//    int B =  sc.nextInt();
//
//    System.out.println(A-B);

//    문제
//    두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
//
//    입력
//    첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
//
//        출력
//    첫째 줄에 다음 세 가지 중 하나를 출력한다.
//
//    A가 B보다 큰 경우에는 '>'를 출력한다.
//    A가 B보다 작은 경우에는 '<'를 출력한다.
//    A와 B가 같은 경우에는 '=='를 출력한다.
//    제한
//        -10,000 ≤ A, B ≤ 10,000

//    Scanner sc = new Scanner(System.in);
//    double A = sc.nextInt();
//    double B = sc.nextInt();
//
//    if (A > B) {
//      System.out.println(">");
//    } else if (A < B) {
//      System.out.println("<");
//    } else {
//      System.out.println("==");
//    }

//    문제 2438
//    첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//
//        입력
//    첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//
//    출력
//    첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

//    *  i=0, j=0 // 별1개
//    ** i=1, j=1
//    ***
//    ****
//    *****

//i=n번, j=i번
//    Scanner sc = new Scanner(System.in);
//
//    int n = sc.nextInt();
//    for(int i = 1; i < n+1; i++){
//      for(int j = 1; j <= i; j++){
//        System.out.print("*");
//      }
//      System.out.println(" ");
//    }

//    문제 2475
//    컴퓨터를 제조하는 회사인 KOI 전자에서는 제조하는 컴퓨터마다 6자리의 고유번호를 매긴다.
//    고유번호의 처음 5자리에는 00000부터 99999까지의 수 중 하나가 주어지며 6번째 자리에는 검증수가 들어간다.
//    검증수는 고유번호의 처음 5자리에 들어가는 5개의 숫자를 각각 제곱한 수의 합을 10으로 나눈 나머지이다.
//
//    예를 들어 고유번호의 처음 5자리의 숫자들이 04256이면, 각 숫자를 제곱한 수들의 합 0+16+4+25+36 = 81 을 10으로 나눈 나머지인 1이 검증수이다.
//
//    입력
//    첫째 줄에 고유번호의 처음 5자리의 숫자들이 빈칸을 사이에 두고 하나씩 주어진다.
//
//    출력
//    첫째 줄에 검증수를 출력한다.

    // 1. 각 자리의 값을 구하기 // 5번 구하기
    // 2. 각 자리의 값을 제곱하기
    // 3. 제곱들을 더한 후, 10으로 나누기 => 검증수

//    Scanner sc = new Scanner(System.in);
//    // 1.1) 1만의 자리부터 구하면, /10000하면 나올듯?
//    int number = sc.nextInt();
////    int firstNumberResult = firstNumber/10000;
////    System.out.println(firstNumberResult);
//
//    // 1.2) 여기서 나머지를 그 다음 단계로 넘겨줘야 될듯 == 천의 자리 나머지 구함
//    // 만약 53,000이 입력된다면, 10000으로 나누고, 몫을 저장하기
//    // - 일의 자리 구하기
//    int firstNumber = number % 10;
//    System.out.println(firstNumber);
//    //만약 54321이라면, 5432의 나머지는 1
//
//    // - 십의 자리 구하기
//    int secondNumber = (number % 100 - firstNumber) / 10;
//    System.out.println(secondNumber);
//    //만약 54321이라면, 나머지는 21인데 여기서 10으로 나누면 몫은 2
//
//    // - 백의 자리 구하기
//    int thirdNumber = (number % 1000 - secondNumber) / 100;
//    System.out.println(thirdNumber);
//    //만약 54321이라면, thirdNumber의 값은 3
//
//
//    // - 천의 자리 구하기
//    int fourthNumber = (number % 10000) / 1000;
//    System.out.println(fourthNumber);
//    // 54321 % 10000 = 4321
//    // 4321 / 1000 = 몫 = 4
//
//    // - 만의 자리 구하기
//    int fifthNumber = (number/10000);
//    System.out.println(fifthNumber);
//    // 54321/10000 = 5
//
//    int sum = (firstNumber * firstNumber) +
//        (secondNumber * secondNumber) + (thirdNumber * thirdNumber) + (fourthNumber * fourthNumber) + (
//        fifthNumber * fifthNumber);
////    System.out.println(sum);
//
//    int result = sum % 10;
//    System.out.println(result);

//      int sum = 0;
//      for (int i = 0; i < 5; i++) {
//        int temp = scanner.nextInt();
//        sum += temp * temp;
//      }
//
//      int result = sum % 10;
//      System.out.println(result);

//    Hello World!를 출력하시오.
//    System.out.println("Hello World!");

//    두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
//    Scanner sc = new Scanner(System.in);
//    int A = sc.nextInt();
//    int B = sc.nextInt();
//    System.out.println(A*B);

//    문제 2439
//    첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//
//    하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.

    // i=실행 숫자, j=스페이스, k=별찍기  //실행해야 되는 순서 1) 스페이스 4칸  2) 별 1개 찍기 --순서로
//    * i=1, j=4, k=1
//   ** i=2, j=3, k=2
//  *** i=3, j=2, k=3
// ****
//*****
    // j=n-1

//k부분에 처음에는 실행이 안되다가 특정 조건에만 *별표를 찍는게 어려움

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
//    int n = 5;
    for (int i = 0; i < n; i++) {

      for (int j = 0; j < n-1-i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k <=i; k++) {
        System.out.print("*");
      }
      System.out.println(" ");
    }
  }
};
