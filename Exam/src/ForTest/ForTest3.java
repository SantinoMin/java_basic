package Exam.src.ForTest;

import java.util.Scanner;

//public class ForTest3 {
//
//  public static void main(String[] args) {

//    Scanner sc = new Scanner(System.in);
//    int cnt = sc.nextInt();
//    char alph = 'a';
//    int number = 1;
//    for(int i=0; i<cnt; i++){
//      for(int j=0; j<i+1; j++){
//        System.out.println(String.format("%3c", alph++);
//      }
//      for(int j=0; j<cnt-i; j++){
//        System.out.println(String.format("%3d", number++));
//      }
//      System.out.println();
//    }



//    for (int i = 0; i < cnt; i++) {
//      for (int j = 0; j < cnt; j++) {
//        System.out.println('*');
//      }
//      System.out.println();
//    }
//  }}
//*****
//*****
//......
    ;
//이거 세로로 나오는 거 가로로 나오도록 하기

//cnt, i, j
// cnt=5, i(행), j(열)
//*  // i=0, j=1
//** // i=1, j=2
//*** // i=2,
//**** // i=3,

//for(int i = 0; i<cnt; i++){
//  for(int j=0; j<i+1; j++){
//    System.out.println("*");
//  }
//  System.out.println();
//    }
//    }}
    ;

//    for (int i = 0; i < cnt; i++) {
//      for (int j = 0; j < i + 1; j++) {
//        System.out.print("*");
//      }
//      System.out.println();
//    }
//  }
//};

//    i=0, j= " " + j<cnt-i

    //cnt=5이고, i=0일 때, j=
//    for (int i = 0; i < cnt; i++) {
//      for (int j = 0; j < i; j++) {
//        System.out.print(" ");
//        for (int j = 0; j < cnt - i; j++) {
//          System.out.print("*");
//        }
//        System.out.println();
//      }
//    }
//  }
//}
    ;

//    for (int i = 0, st=1; i < cnt; i++,st += 2) {
//      for (int j = 0; j < cnt - i - 1; j++) {
//        System.out.print(" ");
//      }
//      for (int j = 0; j < st; j++) {
//        System.out.print("*");
//      }
//      System.out.println();
//    }
//  }
//}
  ;

//초기화를 a,1 두개의 변수로 설정함
//
//for(int i=0; i<cnt; i++){
//  System.out.println("*");
//    for(int j=0; j<cnt;j++){
//      System.out.print("");
//}
//  }}};