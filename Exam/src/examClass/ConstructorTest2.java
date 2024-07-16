package Exam.src.examClass;

class Member {

  int num;
  String name;
  String phone;
  String email;
  String address;

  Member() { // 아래 (1) 부분 에러가 안 뜨게 하려면, 기본 생성자를 만들어 줘야함.

  }

  Member(int numArg, String nameArg, String phoneArg, String emailArg, String addressArg) {
    num = numArg;
    name = nameArg;
    phone = phoneArg;
    email = emailArg;
    address = addressArg;
  }

  Member(int numArg, String nameArg) {
    this(numArg, nameArg, null, null, null);
  }

  Member(int numArg, String nameArg, String phone) {
    this(numArg, nameArg, phone, null, null);
  }

  Member(int numArg) {
    this(numArg, null, null, null, null);
  }

  Member(int numArg, String nameArg, String phone, String email) {
    this.num = numArg;
  }

  String info() {
    return String.format("[%d %s %s %s %s]", num, name, phone, email, address);
  }
}

public class ConstructorTest2 {

  public static void main(String[] args) {
    Member member1 = new Member(); // 기본 생성자 호출 !! (1) !!
    //num=1이 들어가있고, 나머지 값은 null이 들어가있음.
    member1.num = 101;
    member1.name = "고길동";
    member1.phone = "01012344321";
    member1.email = "go@kosta.com";
    member1.address = "서울시 강서구";

    Member member2 = new Member(100, "홍길동", "01012345678", "hong@kosta.com", "서울시 금천구 독산동");

    Member member3 = new Member(102, "김길동");
    Member member4 = new Member(103, "하길동", "010-5678-8766");
    Member member5 = new Member(104);
    Member member6 = new Member(105, "차길동", "010-2345-6543", "cha@kosta.com");

    System.out.println("member3.name = " + member3.name);
    System.out.println(member4.num + " " +  member4.name + " " + member4.email);
    System.out.println(member5.num + " " +  member5.name);
    System.out.println(member6.num + " " +  member6.name);

    System.out.println(member1.info());
    System.out.println(member2.info());
  }
}
