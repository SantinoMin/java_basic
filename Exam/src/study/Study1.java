package Exam.src.study;

public class Study1 {

  public static void main(String[] args) {

    //해결 완료
    String str1 = "Programming";
    String str2 = "Programming";
    String str3 = new String("Programming");
    System.out.println(str3); // 예상: "Programming"

    System.out.println(str1==str2); // 예상 출력: true
    System.out.println(str1==str3); // 예상 출력: true --> false 새로운 객체 참조
    System.out.println(str1.equals(str3)); // true // 문자열만 비교
    System.out.println(str2.equals(str3)); // true // 문자열만 비교
  }
}
