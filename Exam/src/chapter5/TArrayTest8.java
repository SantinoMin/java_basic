package Exam.src.chapter5;

import java.util.Scanner;

public class TArrayTest8 {

  public static void main(String[] args) {

// 2행 4열의 배열 두 개를 만들어서 입력을 받고 두 배열의 곱을 구하여 출력하는 프로그램을 작성하시오.
// "first array"라고 출력한 후 두 줄에 걸쳐 첫 번째 배열의 원소들을 입력받는다.
// "second array"라고 출력한 후 두 줄에 걸쳐 두 번째 배열의 원소들을 입력받는다.

    Scanner sc = new Scanner(System.in);
    int[][] arr1 = new int[2][4];
    int[][] arr2 = new int[2][4];

    //arr1의 배열의 입력
    for (int i = 0; i < arr1.length; i++) {
      String inputLine = sc.nextLine();
      String[] data = inputLine.split(" ");
      for (int j = 0; j < data.length; j++) {
        arr1[i][j] = Integer.parseInt(data[j]);
      }
    }

    //arr2의 배열의 입력
    System.out.println("second array");
    for (int i = 0; i < arr2.length; i++) {
      String inputLine = sc.nextLine();
      String[] data = inputLine.split(" ");
      for (int j = 0; j < data.length; j++) {
        arr2[i][j] = Integer.parseInt(data[j]);
      }
    }

    for (int i = 0; i < arr1.length; i++) {
      for (int j = 0; j < arr1[j].length; j++) {
        System.out.println(arr1[i][j] * arr2[i][j]);
      }
      System.out.println();
    }


  }
}
