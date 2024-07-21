//package Exam.src.baekjoon;
//
//import java.util.Scanner;
//
//public class BJ10950 {
//
//  public static void main(String[] args) {
//
//    Scanner sc = new Scanner(System.in);
//    int c = sc.nextInt();
//    int[] arr = new int[c]; // arr는 c개수만큼 생성되었음
//
//    for (int i = 0; i < c; i++) {
//      int a = sc.nextInt();
//      int b = sc.nextInt();
//      if (a > 0 && b < 10) {
//        arr[i] = a + b;
//      } else {
//        System.out.println("a > 0 or b < 10이여야 합니다.");
//      }
//    }
//    System.out.println(c);
//
//    for (int k = 0; k < c; k++) {
//      System.out.println(arr[k]);
//    }
//  }
//}
