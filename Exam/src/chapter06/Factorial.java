package Exam.src.chapter06;


public class Factorial {
  public static void main(String[] args) {
  long result = factorial(4);
    System.out.println(result);
  }

  static long factorial (int n){
    long result = 0;
    if (n == 1){
      result = 1;
    } else {
      result = n * factorial(n - 1);
    }
    return result;
  }
}

// result = 4*factorial(3)
//factorial(3) = 3*factorial(2)
