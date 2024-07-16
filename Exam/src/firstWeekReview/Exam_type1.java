package Exam.src.firstWeekReview;

public class Exam_type1 {

  public static void main(String[] args) {

    int n=10, m=20;
    int a=10, b=20;
    int r=a+b; // 예상 출력: r=30 // 맞음
    System.out.println(r);

    int rn = n++;
    System.out.println(rn); // 예상 출력: 11 // 실제 출력 : 10 --> 이유: ++뜻이 값이 실행되고 +1이 올라감
    System.out.println(n); //  예상 출력 : 10 // 실제 출력 : 11 --> 이유:  바로 위에서 n이 n++로 인해서 +1이 된 상황.
    //근데 n++이렇게 입력하고 rn에 대입하는 형태인데도 n이 +1이 올라가는 건가?

    int rm = ++m;
    System.out.println(rm); // 예상 출력 : 20 // 실제 출력 : 21 --> 이유 : ++m이라 21의 값이 rm에 +1이 대입 됨.
    System.out.println(m); // 예상 출력 : 20 // 실제 출력 : 21 --> 이유 : ++m이라 +1이 됨

    int t=101, z=201;
    System.out.println(t++); // 예상 출력 : 102 // 실제 출력 : 101 --> 이유 : t++의 의미가 값이 출력되고 +1이 올라가는 형태
    System.out.println(++z); // 예상 출력 : 201 // 실제 출력 : 202 --> 이유 : ++z의 의미가 z의 값이 +1이 된 후에, 출력되는 형태.

    byte b2 = 10;
//    byte br = (b2+1); // 앞에 (byte)를 써줘야 되는 이유?

    short s = 20;
    int sr = b2 + s; // 예상 출력 : 30 // 실제 출력 :
    System.out.println(sr);

    double dd = 10/4;
    System.out.println(dd); // 예상 출력 : 2.5 // 실제 출력 : 2 --> 이유 : double은 소수점은 제외하고 출력 됨.

  }
}
