//package Exam.src.Array;
//
//import java.util.Scanner;
//
//public class ArrayTest5 {
//
//  public static void main(String[] args) {
//
//    // 정수를 입력받다가 0이 입력되면 0을 제외하고 그 때까지 입력 받은 개수를 출력한 후,
//    // 입력받은 정수를 차례로 출력하되 그 수가 홀수이면 2배한 값을,
//    // 짝수인 경우에는 2로 나눈 몫을 출력하는 프로그램을 작성하시오.
//
//    //count를 해가면서 0이면 빠져나오고, 0이 아닌 경우에만 배열에 채워주기
//
//    Scanner sc = new Scanner(System.in);
//
//    //1. 정수가 최대 100개 저장될 배열 생성
//    int[] arr = new int[100];
//
//    //2. 입력횟수를 저장할 변수 선언
//    int cnt = 0;
//
//    //3. 반복문을 통해 입력받은 값을 배열에 저장. 단, 0을 입력 받으면 반복문을 빠져나온다.
//    for (int i = 0; ; i++) {
//      int input = sc.nextInt();
//      if (input == 0) {
//        break;
//      }
//      arr[i] = input;
//      cnt++;
//    }
//    //4. 입력회수만큼 배열의 데이터를 하나씩 가져와 홀수는 값에 x2, 짝수는 /2
//    for (int i = 0; i < cnt; i++) {
//      if (arr[i] % 2 == 0) {
//        System.out.println(arr[i] / 2 + " ");
//      } else {
//        System.out.println(arr[i] * 2) + " ");
//      }
//    }
//  }
//}
