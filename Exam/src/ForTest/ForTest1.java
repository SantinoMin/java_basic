package Exam.src.ForTest;

public class ForTest1 {

  public static void main(String[] args) {

    int sum = 0;
    for (int i = 1; i <= 10; i += 2) {
      sum += i;
      //sum = sum+i;
      //sum = 0+1 = 1  // i=1
      //sum = 1+3 = 4 // i =3
      //sum = 4 +5 = 9 // i =5
      //sum = 9+7=16 // i = 7
      //sum = 16+9 // i = 9 --> sum = 25;
    }
//    System.out.println(sum);

    // dan이 1,2,3단을 의미하고, i가 변하는 수
    for(int i = 2; i < 10; i++){
      for(int dan = 1; dan < 10; dan++){
        System.out.print(String.format("%dx%d=%2d\t", dan, i, dan + i));
      }
          System.out.println();
    }
  }
};