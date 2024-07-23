package Exam.src.study;

public class Study6 {

  public static void main(String[] args) {

    //  출력되는 값 작성
      //완료
    int result[] = new int[5]; // result[]는 int타입이며, 5개의 값을 넣을 수 있음
          //아직 가진거 아니라, 메모리만 확보된 거 맞는지.

    int arr[] = {77, 32, 10, 99, 50};
    for (int i = 0; i < 5; i++) {
      result[i] = 1;  // result[] = {1,1,1,1,1} // 2,4,5,1,3
      for (int j = 0; j < 5; j++) {
        if (arr[i] < arr[j]) {
          result[i]++;

        }
      }
    }
    for (int k = 0; k < 5; k++) {
      System.out.println(result[k]);

      //78, 35,15, 99, 52
    }
  }
}
