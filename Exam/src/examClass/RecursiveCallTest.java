package Exam.src.examClass;

public class RecursiveCallTest {

  //!! 이거 뭐임? 실행되는 순서 이해하기
  public static int factorial (int n){
    if(n==1) return 1;
    return n*factorial(n-1);
  };

  public static void main(String[] args) {
//      int result = factorial(5);
//    System.out.println(result);

    int result = 1;
    for(int i=5; i>=1; i--){
      result *=i;
    }
    System.out.println(result);
  }
};

//오버로딩 오버라이딩

