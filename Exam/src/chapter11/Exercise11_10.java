package Exam.src.chapter11;

import java.util.*;

//1. 문제: 위치가 잘 섞이지 않음
//2. 발생 이유와 개선 방법 작성.

class Exercise11_10 {

  public static void main(String[] args) {
    //Set은 중복 요소를 허용하지 않으며, 요소의 순서가 중요하지 않음.
    Set set = new HashSet();
    int[][] board = new int[5][5];

    for (int i = 0; set.size() < 25; i++) {
      set.add((int) (Math.random() * 30) + 1 + "");
    }

    //Iterator는 Java의 컬렉션 프레임 워크(List,set)에서
    // 저장된 요소를 순차적으로 접근하는데 사용되는 인터페이스.
    Iterator it = set.iterator();

//    HashMap map = new HashMap();
//    map.put()




    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        board[i][j] = Integer.parseInt((String) it.next());
        System.out.print((board[i][j] < 10 ? " " : " ") + board[i][j]);
      }
      System.out.println();
    }
  } // main
}