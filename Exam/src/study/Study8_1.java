package Exam.src.study;

public class Study8_1 {

  public static void main(String[] args) {

    int i = 0;
    int sum = 0;
    while(i < 10){
      i++;
      if(i % 2 == 1){ // i가 홀수인 경우에는 다시 continue통해서 위로 올라감.
        continue;
      }
        sum += i; // sum = sum + i;
    }
    System.out.println(sum);
  }
}
