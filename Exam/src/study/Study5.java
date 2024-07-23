package Exam.src.study;

public class Study5 {

  public static void main(String[] args) {

    //출력되는 값
    //맞춤

    int a =0;
    for (int i = 1; i < 999; i++){
      if( i % 3 == 0 && i % 2 == 0){
        a = i;

        // i가 3의 배수이면서 2의 배수인 값인 경우에만 a에 넣음
        //1,2,3,4,5,6,7,8,9
        //6,12,18..
//        998/6 996/6
      }
      System.out.println(a);
    }
  }
}
