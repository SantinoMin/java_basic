package Exam.src.Array;

public class ArrayExam7 {

  public static void main(String[] args) {

    int[] arr = {95, 75, 85, 100, 50};
    //5개의 정수를 { } 로 초기화하고 오름차순으로 정렬하여 출력하는 프로그램 작성하기.

    int cnt = 0;
    //5개 일 때 행은 4개임 // cnt-1개
    //j가 5보다 작아야 함 4.3.2.1..// cnt랑 i를 비교해서 4.3.2.1이 되도록 만들기
    for(int i=1; i<arr.length-1; i++){
      for(int j=0; j<arr.length-i-1; j++){
        if(arr[j]>arr[j+1]) {
          int t = arr[j];  // t가 앞의 값을 말하는 건가?
          arr[j] = arr[j + 1]; // 바꾼 값이 기존의 값이랑 같다면?
          arr[j + 1] = t; // 바꾼 값을 뒤에 값이랑 다시 바꾸는듯?
        }
        }}
    for(int i=0; i<arr.length; i++){
      System.out.println(arr[i]+" ");
    }}};





    //피벗? 선택한 걸 말함
    //옆과 비교해서, 자리 찾아가는 과정

    //버블 정렬
    //95 75 85 100 50
    //75 85 95 50 100  // i=0, j=4
    //75 85 50 95      // i=1, j=3
    //75 50 85         // i=2, j=2
    //50 75            // i=3, j=1
    //50

