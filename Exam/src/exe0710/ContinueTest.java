package Exam.src.exe0710;

public class ContinueTest {

  public static void main(String[] args) {
    int sum = 0;
    for(int i=1; i<=10; i++){
      if(i%3==0) continue;
      sum += i;
//      if(i%3!=0) sum+=i;
    }
    System.out.println(sum);
  }
}
