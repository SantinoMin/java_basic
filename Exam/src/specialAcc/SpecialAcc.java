package Exam.src.specialAcc;

/**
 * 특수 계좌 SpecialAccount 속성: 계좌번호, 이름, 잔액, 등급(VIP, Gold, Silver, Normal 기능: 입금, 출금, 계좌 조회 // 입금만 등급에
 * 따라 달라짐. !! 특수 계좌는 일반계좌와 다르게 입금시마다 등급별로 이자를 지급하여 더해준다. (즉, 10,000원 입금할 경우, VIP: 10,400원 / Gold:
 * 10,300원 / Silver: 10,200원 / Normal: 10,100원이 입금 된다) 조회: 예) 계좌번호 10001, 이름: 홍길동, 잔액: 100,000원, 등급:
 * VIP
 */
public class SpecialAcc extends Account {

  String grade;

  public String getGrade() {
    return grade;
  }

  public void setGrade(String grade) {
    switch (grade.charAt(0)) {
      case 'V':
      case 'v':
        this.grade = "VIP";
        break;
      case 'G':
      case 'g':
        this.grade = "Gold";
        break;
      case 'S':
      case 's':
        this.grade = "Silver";
        break;
      default:
        this.grade = "Normal";
        break;
    }
  }

//    this.grade = grade;


  public SpecialAcc(int AccNum, String name, int money) {
    super(AccNum, name, money);
    setGrade(grade);
  }


  //자식쪽에서 override하는거 맞는지?
  @Override
  public void deposit(int money) {
    switch (grade) {
      case "VIP":
        money *= 1.04;
        break;
      case "Gold":
        money *= 1.03;
        break;
      case "Silver":
        money *= 1.02;
        break;
      case "Normal":
        money *= 1.01;
        break;
    }
    super.deposit(money);
  }
}
