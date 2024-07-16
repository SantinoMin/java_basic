package Exam.src.exe0710;

public class Exem4_10 {

  public static void main(String[] args) {
    int num = 12345;
    int sum = 0;
    for(;num!=0;){
      //!! 이거 왜 sum에서 num%10으로 나누는지??
      sum += num%10; // sum = sum + num%10;
      num /= 10;
    }
    System.out.println(sum);
  }
}
// num = 12345
//!! 질문 필요: 여기 아래 값들도 num인건지?
//12345%10 --> 나머지 5 // num=12345/10
//1234%10  나머지:4 // num=1234/10
//123%10 나머지: 3 // num=123/10

