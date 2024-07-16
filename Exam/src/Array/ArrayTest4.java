package Exam.src.Array;

import java.util.Scanner;

public class ArrayTest4 {

  public static void main(String[] args) {

    //입력 : 5
    // 2 4 6 8 5 옆으로 아니라, 밑으로 받도록.
    //출력 : 2 4 6 8 5

    //입력을 개수로 받고, 그 개수 만큼 배열을 선언하고
    //입력의 개수만큼 배열에 담기.

    //입력을 개수로 받고
    Scanner sc = new Scanner(System.in);
    int cnt = sc.nextInt();

    //입력한 개수만큼 배열을 생성
    int[] arr = new int[cnt];
    for(int i=0; i<arr.length; i++){
      arr[i] = sc.nextInt();
    }

    for(int i=0; i<arr.length; i++){
      System.out.println(arr[i]+ " ");
    }

    //!!다시 보기



  }
}
