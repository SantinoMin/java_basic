//package Exam.src.chapter9;
//
//class Exam9_9 {
//
//  public static String delChar(String src, String delStr) {
//
//    //출력되는 값 확인하기
//    StringBuilder sb = new StringBuilder(src);
//
//    for (int i = 0; i < delStr.length(); i++) {
//      while (true) {
//        int idx = sb.indexOf(delStr.charAt(i) + "");
//        if (idx < 0) {
//          break;
//        }
//        sb.deleteCharAt(idx);
//      }
//    }
//    return sb.toString();
//
//    //파라미터 가져온걸 string.builder에 담아서
//    //length만큼 for문
//    //캐릭터가 앞에서 몇번째 있는지 찾고
//  }
//
//  ;
//
//
//  public static void main(String[] args) {
//    System.out.println("(1!2@3^4~5)" + " -> " + delChar("(1!2@3^4~5)", "~!@#$%^&*()"));
//    System.out.println("(1 2 3 4\t5)" + " -> " + delChar("(1 2 3 4\t5)", " \t"));
//
//
//  }
//}
//
