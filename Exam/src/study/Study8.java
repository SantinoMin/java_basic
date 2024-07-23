package Exam.src.study;

public class Study8 {

  public static void main(String[] args) {
    int i = 0;
    int sum = 0;
    while (i < 10) {
      i++;
      if (i % 2 == 1) { // i=3,5,7,9 일때만
        continue;
      }  // i = 1,2,4,6,8 일때의 i
      sum += i; // sum = sum + i //

    }
    System.out.println(sum);
  }
}
