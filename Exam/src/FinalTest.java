package Exam.src;

//!!final의 초기화는 생성자를 통해서 함

//모든 멤버 = 멤버 번호 가지고 있다고 가정
class Member {

  //다 다른값을 쓰기위해 인스턴스 변수를 사용함(동일한 값이면 static 사용)
  final int no;
  static final String society;

  static { // static final 변수는 명시적 초기화 또는 static 블럭에서 초기화 한다.
    society = "Running";
   }


  //final은 초기화를 "생성자"에서 한다.
  Member(int no) {
    this.no= no;
  }

  String info(){
    return "no:" + no + "society:" + society;
  }
}

public class FinalTest {

  public static void main(String[] args) {
      Member member1 = new Member(10);
      Member member2 = new Member(20);


  }
}
