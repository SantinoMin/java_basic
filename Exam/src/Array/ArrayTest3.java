package Exam.src.Array;

public class ArrayTest3 {

  public static void main(String[] args) {
    //정수 5개의 배열을 할당, 선언하고 1,2,3,4,5로 초기화하여 다음과 같이 출력하시오.
    //출력: 5,4,3,2,1

    int[] arr = {1,2,3,4,5};
    for(int i=arr.length-1; i>=0; i--) {
      System.out.print(arr[i] + " ");
    }
  }
}
