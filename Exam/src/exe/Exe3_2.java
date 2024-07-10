package Exam.src.exe;

import org.w3c.dom.ls.LSOutput;

public class Exe3_2 {

  public static void main(String[] args) {
    int numOfApples = 123; // 사과의 개수
    int sizeOfBucket = 10; // 바구니 크기
    int numOfBucket = numOfApples%sizeOfBucket==0 ? numOfApples/sizeOfBucket : numOfApples/sizeOfBucket+1;// 모든 사과를 담는데 필요한 바구니의 수

    System.out.println("필요한 바구니의 수:" + numOfBucket);

  }
}
