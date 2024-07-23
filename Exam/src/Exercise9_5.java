//package Exam.src;
//
////!!다시 해보기
//class Exercise9_5 {
//
//  public static int count(String src, String target) {
//    int count = 0; // 찾은 횟수
//    int pos = 0; // 찾기 시작할 위치
//
//    //(1)
//    //indexOf()메서드는 원하는 target이 발견되지 않으면 -1을 반환함.
//     src.indexOf(target, pos);
//
//     while((pos = src.indexOf(target, pos)) != -1){
//       count++;
//
//       //여기부터 이해 좀 안됨.
//       pos += target.length();
//     }
//
//
//    if (pos < src.length()) {
//          pos++;
//      if (pos == src.length()) {
//        count++;
//        pos += target.length();
//        if(find==-1){
//          return count;
//        }
//      }
//    }
//    return count;
//  }
//
//  ;
//
//  public static void main(String[] args) {
//    System.out.println(count("12345AB12AB345AB", "AB"));
//    System.out.println(count("12345", "AB"));
//  }
//}