package Exam.src.study;

public class Study4 {
 //완료
  //출력되는 값

  public static void main(String[] args) {

    Cond obj = new Cond(3);
    obj.a = 5; // a=5로 초기화
    int b = obj.func();
    System.out.println(obj.a + b);
  }
}

class Cond {
  int a;
  public Cond(int a) {
    this.a = a;
  }
  public int func(){
    int b = 1;
    for(int i=1; i < a; i++){
      b += a * i; // b = b + a * i // 즉, b=6
                  // b = 6 + 10 // 즉, b = 16
                  // b = 16 + 15 // 즉, b= 31
                  // b = 31 + 20 // 즉 b = 51
               //16,31,51
      //+15, +20 +25..// 16, 31, 51,
      //a+b =  =  56 예상
    }
    return a + b;
  }

}
