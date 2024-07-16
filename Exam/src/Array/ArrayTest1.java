package Exam.src.Array;

public class ArrayTest1 {

  public static void main(String[] args) {

    int[] narr = new int[5];
    //배열은 인덱스{  []안의 값 }을 붙여야만 선언이 됨.
    narr[0] = 10;
    narr[1] = 20;
    narr[2] = 30;
    narr[3] = 40;
    narr[4] = 50;

    //5번 인덱스는 없음 // 배열이 5개일 경우 5번째를 사용할 수 없다.(0~4 사용)
    narr[5] = 10;

//    for(int i=0; i<=5; i++){
//      System.out.println(narr[i]);  // i<=5라고 쓸 수 없음 // 배열은 0부터 시작하기 때문에.
     // <=가 아닌 i<5라고 써야함
//
//    }

    for(int i=0; i<narr.length; i++) {
      System.out.println(narr[i]);  // i<=5라고 쓸 수 없음 // 배열은 0부터 시작하기 때문에.

    }

    //변수는 선언하고 바로 초기화 가능함
    int n = 100;
    int m;
    m = 200;

    //배열도 선언하고 초기화 가능
    double[] darr; //배열 선언

    //!! ? 어떻게 초기화가 되는거임? darr[]가 아니라 darr라고 씀?
    darr = new double[3];  // 배열 객체 생성 & 배열명에 할당

    //초기화는
    int[] narr2 = new int[]{1,2,3,4,5};  // int[]여기 안에 값을 넣을 수 없음
    //만약 { }에 값을 설정한 경우. // 초기화 1

    int[] narr3 = {1,2,3,4,5}; // 위에 new int[]{1,2,3,4,5}와 같음 // 생략을 한 것.
     //초기화 2

    int[] narr4 = new int[]{1,2,3,4,5};

    //아래처럼 따로따로 할 때에는 new int[]를 생략할 수 없음
//    int[] narr5;
//    narr5 = {1,2,3,4,5}; // 이렇게 쓰면 에러 남, 생략 불가.









    }
}
