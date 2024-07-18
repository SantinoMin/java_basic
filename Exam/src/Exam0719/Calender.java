package Exam.src.Exam0719;

class Month {

  String month;

  Month() {
  }

  Month(String month) {
    this.month = month;
  }

  String getMonth() {
    return month;
  }
}

class Day {

  int day;

  Day(int day) {
    this.day = day;
  }
  int getDay(){
    return day;
  };

}


//궁금증: 클래스 내부의 멤버 변수들(인스턴스 변수, 클래스 변수) 사용법
public class Calender {

  public static void main(String[] args) {
    Month month = new Month("1월");
    System.out.println(month.getMonth());

    Day day = new Day(12);
    System.out.println(day.getDay());
  }
}
