package Exam.src.study;

public class Study3 {
  //맞춤
  //출력되는 값 작성하기
  static int[] mkarr(){
    int[] tmpArr = new int[4]; // tmpArr배열에 4개의 값이 들어가있음
    for(int i=0; i<tmpArr.length; i++){
      tmpArr[i] = i;          // tmpArr[0] = 0; 이렇게 i값과 =결과값이 같음
    }

    return tmpArr;
  }
  //즉 tmpArr[0] = 0
  //   tmpArr[1] = 1 이런식으로 반환


  public static void main(String[] args) {
    int[] arr;          // arr는 int[]배열 타입
    arr = mkarr();      // arr에 mkarr()메서드를 대입
    for(int i = 0; i< arr.length; i++){
      System.out.println(arr[i]);  // arr[0]도 mkarr()통해서 얻은 값 0,1,2,3이라서
                                    // int[0] = 0 , int[1] = 1 이런식
      // }   예상출력 0,1,2,3
  }
}};
