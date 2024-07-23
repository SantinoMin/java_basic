package Exam.src.study;

public class Study7 {

  public static void main(String[] args) {
    //완료
    //객체 생성없이 사용할 수 있는 메소드로써 출력 결과
    int i, j;
    for(j=0, i=0; i<=5; i++){  // i=0,1,2,3,4,5 총 6번 실행
      j+=i;       // i=0, j = j+i = 0 + 0
                  // i=1, j = 0+1 = 1
                  // i=2, j = 1+2 = 3
                  // i=3, j = 3+3 = 6
      //10 15

      System.out.println(i); //출력: 5
      if(i==5){
        System.out.println("=");
        System.out.println(j);
      }else {
        System.out.println("+");
      }  // + + + + + = 15
    }
  }
}
