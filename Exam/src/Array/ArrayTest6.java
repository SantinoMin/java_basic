package Exam.src.Array;

import java.util.Scanner;

public class ArrayTest6 {

  public static void main(String[] args) {
    //세 자리 이하의 정수를 차례로 입력 받다가 999가 입력되면 프로그램을 종료하고
    //그때까지 입력된 최대값과 최소값을 출력하는 프로그램을 작성하시오.
    //입력받는 정수는 100개 이하이다.

    Scanner sc = new Scanner(System.in);

    //1. 3자리 이하의 정수를 입력 받는 배열 생성
         int[] arr = new int[100];
         int min, max, cnt=0;



    //2. 999가 입력되면 종료되는 반복문 작성
        for( int i = 0; i<arr.length; i++){
          int input = sc.nextInt();
          if (input == 999) break;
            arr[i] = input;
            cnt++;
        }

        min=max=arr[0];
        for(int i=1; i<cnt; i++){
          if(arr[i]>max) max=arr[i];
          if(arr[i]<min) min=arr[i];
        }
    System.out.println("max :  " + max);
    System.out.println("min :  " + min);

    //3. 입력된 값들 중에, 최대값과 최소값 구하기 // 입력받는 정수는 100개


  }
}
