package study;

public class Study1 {

  public static void main(String[] args) {

    //출력값은?

    String str1 = "Programming";
    String str2 = "Programming";
    String str3 = new String("Programming");

    System.out.println(str1==str2); // 예상 출력:
    System.out.println(str1==str3);
    System.out.println(str1.equals(str3));
    System.out.println(str2.equals(str3));
  }
}
