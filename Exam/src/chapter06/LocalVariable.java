package Exam.src.chapter06;

public class LocalVariable {
  int num = 1;
    public void printNumbers() {
      int a = 10; // 'a'는 printNumbers 메서드 내에서만 유효한 지역변수입니다.
      if (a > 0) {
        int b = 20; // 'b'는 if 블록 내에서만 유효한 지역변수입니다.
        System.out.println("a: " + a);
        System.out.println("b: " + b);
      }
//       System.out.println("b: " + b);
//       오류: 'b'는 if 블록 내에서만 유효하기 때문에 여기서는 접근할 수 없습니다.
    }

    public static void main(String[] args) {
      LocalVariable example = new LocalVariable();
      example.printNumbers();
      // System.out.println("a: " + a); // 오류: 'a'는 main 메서드에서 접근할 수 없습니다.
    }
};
