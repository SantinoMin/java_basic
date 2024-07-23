package Exam.src;

import java.util.Scanner;

public class ExceptionEx6 {

  public static void main(String[] args) {

    try {
//      Exception e = new Exception("에러 발생시 출력");
//      throw e;
      throw new Exception("에러 발생시 출력");

    } catch (Exception e) {
      System.out.println("에러 발생 " + e.getMessage());
      e.printStackTrace();
    }
    System.out.println("프로그램 정상 종료");
  }
}
