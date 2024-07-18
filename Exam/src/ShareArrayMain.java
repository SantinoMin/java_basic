package Exam.src;

import Exam.src.pac1.ShareArray;

public class ShareArrayMain {
  public static void main(String[] args) {

    //싱글톤 뭐..?
    //sa, sa2 레퍼런스 주소가 같다.
    ShareArray sa = ShareArray.getRefshareArray();
    sa.addData(100);
    sa.addData(200);
    sa.addData(300);

    ShareArray sa2 = ShareArray.getRefshareArray();
    System.out.println(sa2.getData(0));
    System.out.println(sa2.getData(1));
    System.out.println(sa2.getData(2));
  }

}
